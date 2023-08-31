import "./App.css";
import Row from "./Row";
import requests from "./requests";
import Banner from "./Banner";
import Nav from "./Nav";

//This is nicely organized into components
//Everything that is displayed on the frontend is just a component
function App() {
  return (
    <div className="App">
      <Nav />
      <Banner />
      <Row
        title="Prime Amazon Originals"
        fetchUrl={requests.fetchPrimeVideoOriginals}
        isLargeRow={true}
      />
      <Row title="Prime Trending Now" fetchUrl={requests.fetchTrending} />
      <Row title="Prime Top Rated" fetchUrl={requests.fetchTopRated} />
      <Row title="Prime Action Movies" fetchUrl={requests.fetchActionMovies} />
      <Row title="Prime Comedy Movies" fetchUrl={requests.fetchComedyMovies} />
      <Row title="Prime Horror Movies" fetchUrl={requests.fetchHorrorMovies} />
      <Row
        title="Prime Romance Movies"
        fetchUrl={requests.fetchRomanceMovies}
      />
      <Row
        title="Prime Science Fiction Movies"
        fetchUrl={requests.fetchScienceFiction}
      />
    </div>
  );
}

export default App;
