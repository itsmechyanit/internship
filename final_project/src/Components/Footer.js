import { Link } from "react-router-dom";

import "./Footer.css";
function Footer() {
  return (
    <footer className="footer">
      <div className="footer__logo-box">
        <img src="/site-logo.png" alt="Website Logo" className="footer__img" />
      </div>
      <div className="row">
        <nav className="footer__nav">
          <ul className="footer__list">
            <li className="footer__item">
              <Link to="/" className="footer__link">
                HOME
              </Link>
            </li>
            <li className="footer__item">
              <Link to="/" className="footer__link">
                CONTACT ME
              </Link>
            </li>
            <li className="footer__item">
              <Link
                to="https://www.facebook.com/chyanit.singh"
                className="footer__link"
                target="_blank"
                rel="noreferrer"
              >
                FACEBOOK
              </Link>
            </li>
            <li className="footer__item">
              <Link
                to="https://github.com/itsmechyanit/"
                className="footer__link"
                target="_blank"
                rel="noreferrer"
              >
                GITHUB
              </Link>
            </li>
          </ul>
        </nav>
        <p className="footer__text">
          Built By Chyanit Singh for showcasing his skills. Copyright &copy; by
          Chyanit Singh. Thanks for visiting my site and I hope you liked it
          😊...
        </p>
      </div>
    </footer>
  );
}

export default Footer;
