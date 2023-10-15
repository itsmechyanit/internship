import { Link } from "react-router-dom";
import "./ProjectStyles.css";

function Html() {
  return (
    <div className="container">
      <h2 className="container__title">HTML and CSS Projects</h2>
      <div className="card--project">
        <figure>
          <img
            src="/logo-omnifood.png"
            alt="Omnifood"
            className="card--project__img"
          />
        </figure>
        <div className="card--project__content">
          <a
            className="card--project__cta"
            href="https://omnifood-chyanit.netlify.app"
            target="_blank"
            rel="noreferrer"
          >
            Click Here For The Live Demo
          </a>
          <h4 className="card--project__title">OMNIFOOD</h4>

          <p className="card--project__description">
            A fake food subscription company
          </p>
        </div>
        <Link to="/" className="card--project__button">
          CONTACT ME
        </Link>
      </div>
      <div className="card--project">
        <figure>
          <img
            src="/logo-green-1x.png"
            alt="Natours"
            className="card--project__img"
          />
        </figure>
        <div className="card--project__content">
          <a
            className="card--project__cta"
            href="https://chyanit-natours.netlify.app"
            target="_blank"
            rel="noreferrer"
          >
            Click Here For The Live Demo
          </a>
          <h4 className="card--project__title">NATOURS</h4>

          <p className="card--project__description">
            A fake tours and travel company
          </p>
        </div>
        <Link to="/" className="card--project__button">
          CONTACT ME
        </Link>
      </div>
    </div>
  );
}

export default Html;
