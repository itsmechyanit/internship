import Header from "../Components/Header";
import "./Experience.css";
import "./Card.css";
import { Link } from "react-router-dom";
import Footer from "../Components/Footer";
function Experience() {
  return (
    <>
      <Header />
      <div className="experience">
        <p className="experience__subtitle">OVER 7 YEARS OF EXPERIENCE</p>
        <h2 className="experience__title">My Experience</h2>
        <div className="card">
          <figure>
            <img
              src="/logo-accenture.jpg"
              alt="Accenture"
              className="card__img"
            />
          </figure>
          <div className="card__content">
            <span className="card__date">2012-2016</span>
            <h4 className="card__title">Accenture Services PVT Limited</h4>
            <h6 className="card__subtitle">Software Engineering Analyst</h6>
            <p className="card__description">High Performance Delivered</p>
          </div>
          <Link to="/" className="card__button">
            CONTACT ME
          </Link>
        </div>
        <div className="card">
          <figure>
            <img
              src="/logo-goldliger.png"
              alt="GoldLiger"
              className="card__img"
            />
          </figure>
          <div className="card__content">
            <span className="card__date">2019-2023</span>
            <h4 className="card__title">GoldLiger Marketing, Inc.</h4>
            <h6 className="card__subtitle">Customer Support Manager</h6>
            <p className="card__description">High Performance Delivered</p>
          </div>
          <Link to="/" className="card__button">
            CONTACT ME
          </Link>
        </div>
        <div className="card">
          <figure>
            <img
              src="/logo-fliprobo.png"
              alt="FlipRobo"
              className="card__img"
            />
          </figure>
          <div className="card__content">
            <span className="card__date">2023-Present</span>
            <h4 className="card__title">Flip Robo Technologies LLC</h4>
            <h6 className="card__subtitle">FullStack Developer Intern</h6>
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

export default Experience;
