import { Link } from "react-router-dom";
import "./ProjectStyles.css";

function Javascript() {
  return (
    <div className="container">
      <h2 className="container__title">JAVASCRIPT Projects</h2>
      <div className="card--project">
        <figure>
          <img
            src="/logo-bankist.png"
            alt="Bankist"
            className="card--project__img"
          />
        </figure>
        <div className="card--project__content">
          <a
            className="card--project__cta"
            href="https://chyanit-banking-site.netlify.app"
            target="__blank"
            rel="noreferrer"
          >
            Click Here For The Live Demo
          </a>
          <h4 className="card--project__title">BANKIST</h4>

          <p className="card--project__description">
            A fake bank's marketing website
          </p>
        </div>
        <Link to="/" className="card--project__button">
          CONTACT ME
        </Link>
      </div>
      <div className="card--project">
        <figure>
          <img
            src="/logo-forkify.png"
            alt="Forkify"
            className="card--project__img"
          />
        </figure>
        <div className="card--project__content">
          <a
            className="card--project__cta"
            href="https://chyanit-forkify.netlify.app"
            target="__blank"
            rel="noreferrer"
          >
            Click Here For The Live Demo
          </a>
          <h4 className="card--project__title">FORKIFY</h4>

          <p className="card--project__description">
            A recipe generator website
          </p>
        </div>
        <Link to="/" className="card--project__button">
          CONTACT ME
        </Link>
      </div>
    </div>
  );
}

export default Javascript;
