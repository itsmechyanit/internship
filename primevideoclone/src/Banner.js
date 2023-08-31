import React, { useEffect, useState } from "react";
import axios from "./axios";
import requests from "./requests";
import "./Banner.css";

//The banner component randomly picks a movie from a list and then displays it as the hero section of our page

function Banner() {
  const [movie, setMovie] = useState({});
  useEffect(() => {
    async function getRandomMovie() {
      const response = await axios.get(requests.fetchPrimeVideoOriginals);
      //getting a random movie from Prime Video Orignals
      setMovie(
        response.data.results[
          Math.floor(Math.random() * response.data.results.length - 1)
        ]
      );
      return response;
    }
    getRandomMovie();
  }, []);
  //if the description of the movie is bigger than 150 characters then we will strip it down by adding ... after the 150th character
  function limitText(str, n) {
    return str?.length > n ? str.slice(0, n) + "..." : str;
  }
  //This creates the hero/banner componenet at the top
  return (
    <header
      className="banner"
      style={{
        backgroundSize: "cover",
        backgroundPosition: "center center",
        backgroundImage: `url(https://image.tmdb.org/t/p/original/${movie?.backdrop_path})`,
      }}
    >
      <div className="banner__content">
        <h1 className="banner__title">
          {movie?.title || movie?.name || movie?.original_name}
        </h1>
        <div className="banner__buttons">
          <button className="banner__button">Play</button>
          <button className="banner__button">My List</button>
        </div>
        <p className="banner__description">{limitText(movie?.overview, 150)}</p>
      </div>
      <div className="banner--fadebottom"></div>
    </header>
  );
}

export default Banner;
