//The API key to fetch data from the TMDB database
const API_KEY = "a73137d0afcc5686a77c484ef2624618";
//Request object that holds info about various end points
const requests = {
  fetchTrending: `/trending/all/week?api_key=${API_KEY}&language=en-US&with_networks=1024`,
  fetchPrimeVideoOriginals: `/discover/tv?api_key=${API_KEY}&with_networks=1024`,
  fetchTopRated: `/movie/top_rated?api_key=${API_KEY}&language=en-US&with_networks=1024`,
  fetchActionMovies: `/discover/movie?api_key=${API_KEY}&with_networks=1024&with_genres=28`,
  fetchComedyMovies: `/discover/movie?api_key=${API_KEY}&with_networks=1024&with_genres=35`,
  fetchHorrorMovies: `/discover/movie?api_key=${API_KEY}&with_networks=1024&with_genres=27`,
  fetchRomanceMovies: `/discover/movie?api_key=${API_KEY}&with_networks=1024&with_genres=10749`,
  fetchScienceFiction: `/discover/movie?api_key=${API_KEY}&with_networks=1024&with_genres=878`,
};

export default requests;
