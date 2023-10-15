import { Link } from "react-router-dom";
import "./ProjectStyles.css";

function React() {
  return (
    <div className="container">
      <h2 className="container__title">React Projects</h2>
      <div className="card--project">
        <figure>
          <img
            src="/logo-react.png"
            alt="React Quiz"
            className="card--project__img"
          />
        </figure>
        <div className="card--project__content">
          <a
            className="card--project__cta"
            href="https://chyanit-react-quiz.netlify.app"
            target="__blank"
            rel="noreferrer"
          >
            Click Here For The Live Demo
          </a>
          <h4 className="card--project__title">REACT QUIZ</h4>

          <p className="card--project__description">A quiz made in React</p>
        </div>
        <Link to="/" className="card--project__button">
          CONTACT ME
        </Link>
      </div>
      <div className="card--project">
        <figure>
          <img
            src="/logo-imdb.jpeg"
            alt="Movie Rating"
            className="card--project__img"
          />
        </figure>
        <div className="card--project__content">
          <a
            className="card--project__cta"
            href="https://chyanit-usepopcorn.netlify.app"
            target="__blank"
            rel="noreferrer"
          >
            Click Here For The Live Demo
          </a>
          <h4 className="card--project__title">USEPOPCORN</h4>

          <p className="card--project__description">
            A fake movie rating website
          </p>
        </div>
        <Link to="/" className="card--project__button">
          CONTACT ME
        </Link>
      </div>
    </div>
  );
}

export default React;
