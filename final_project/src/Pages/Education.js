import Footer from "../Components/Footer";
import Header from "../Components/Header";
import "./Education.css";
import { Link } from "react-router-dom";
function Education() {
  return (
    <>
      <Header />
      <div className="education">
        <p className="education__subtitle">BTECH, DUAL MBA</p>
        <h2 className="education__title">Education</h2>
        <div className="card">
          <figure>
            <img
              src="/logo-mpstme.png"
              alt="MPSTME Mumbai"
              className="card__img"
            />
          </figure>
          <div className="card__content">
            <span className="card__date">2008-2012</span>
            <h4 className="card__title">MPSTME NMIMS Mumbai</h4>
            <h6 className="card__subtitle">B.Tech In Computer Science</h6>
            <p className="card__description">High Performance Delivered</p>
          </div>
          <Link to="/" className="card__button">
            CONTACT ME
          </Link>
        </div>
        <div className="card">
          <figure>
            <img src="/logo-AMS.png" alt="AMS" className="card__img" />
          </figure>
          <div className="card__content">
            <span className="card__date">2016-2017</span>
            <h4 className="card__title">Antwerp Management School Belgium</h4>
            <h6 className="card__subtitle">
              MBA Innovation & Entrepreneurship
            </h6>
            <p className="card__description">High Performance Delivered</p>
          </div>
          <Link to="/" className="card__button">
            CONTACT ME
          </Link>
        </div>
        <div className="card">
          <figure>
            <img src="/ximb-logo.webp" alt="XIMB" className="card__img" />
          </figure>
          <div className="card__content">
            <span className="card__date">2017-2018</span>
            <h4 className="card__title">XIMB Bhubaneshwar</h4>
            <h6 className="card__subtitle">MBA Marketing</h6>
            <p className="card__description">High Performance Delivered</p>
          </div>
          <Link to="/" className="card__button">
            CONTACT ME
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Education;
