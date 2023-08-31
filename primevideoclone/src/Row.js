import React, { useEffect, useState } from "react";
import axios from "./axios";

import "./Row.css";
import YouTube from "react-youtube";
import movieTrailer from "movie-trailer";

const base_url = "https://image.tmdb.org/t/p/original";
//This file deals with getting a row of films dynamically from the TMDB database and then redering it on the frontend.

//Row is one of the componenets and it accceps various Props... Based on the props values it will behave differently
//title will hold the row title which will be provided from App.js
//fetchUrl determines the end point
//IsLargeRow determines whether the row is "PRIME AMAZON Originals" which is bigger than the other rows
function Row({ title, fetchUrl, isLargeRow }) {
  const [movies, setMovies] = useState([]);
  const [trailerURL, setTrailerUrl] = useState("");
  //break the title into 2 parts. The first part will be blue and the other one will be white
  const title1 = title.split(" ")[0].concat(" ");
  const title2 = title.split(" ").slice(1).join(" ");

  //This will fetch the array of movies asynchronously
  useEffect(() => {
    async function fetchData() {
      const response = await axios.get(fetchUrl);

      setMovies(response.data.results);
      return response;
    }
    fetchData();
  }, [fetchUrl]);

  //This simply sets the option for the Youtube movie trailer
  const opts = {
    height: "390",
    width: "100%",
    playerVars: {
      autoplay: 1,
    },
  };

  //Whever a movie poster is clicked the trailer of the movie should be displayed
  //if the trailer is playing and we clicked on the poster again the trailer window will dissapear
  function handleClick(movie) {
    if (trailerURL) {
      setTrailerUrl("");
    } else {
      movieTrailer(
        movie?.name ||
          movie?.original_name ||
          movie?.title ||
          movie?.original_title ||
          ""
      )
        .then((url) => {
          //console.log(url);

          const urlParms = new URLSearchParams(new URL(url).search);
          setTrailerUrl(urlParms.get("v"));
        })
        .catch((err) => {
          console.log(err);
        });
    }
  }
  //This simply returns the row htmlMarkup
  return (
    <div className="row">
      {/* Titile */}
      <h2 className="row__title">
        <span className="focus">{title1}</span>
        <span>{title2}</span>
      </h2>
      {/* container */}
      <div className="row__posters">
        {movies.map((movie) => (
          <figure
            className="row__poster"
            key={movie.id}
            onClick={() => handleClick(movie)}
          >
            <img
              src={`${base_url}${
                isLargeRow ? movie.poster_path : movie.backdrop_path
              }`}
              alt={movie.name}
              className={`row__posters__img ${
                isLargeRow && "row__posters__img--large"
              }`}
            />
          </figure>
        ))}
      </div>
      {/* This is responsible for displaying the movie trailer */}
      {trailerURL && <YouTube videoId={trailerURL} opts={opts} />}
    </div>
  );
}

export default Row;
