import "./Header.css";
import { NavLink } from "react-router-dom";
function Header() {
  return (
    <header className="header">
      <NavLink href="/">
        <img src="/site-logo.png" alt="Website Logo" className="header__img" />
      </NavLink>
      <nav className="nav">
        <ul className="nav__items">
          <li>
            <NavLink to="/" className="nav__link">
              Home
            </NavLink>
          </li>
          <li>
            <NavLink to="/experience" className="nav__link">
              Experience
            </NavLink>
          </li>
          <li>
            <NavLink to="/education" className="nav__link">
              Education
            </NavLink>
          </li>
          <li>
            <NavLink to="/Skills" className="nav__link">
              Skills
            </NavLink>
          </li>
          <li>
            <NavLink to="/Projects" className="nav__link">
              Projects
            </NavLink>
          </li>
          <li>
            <NavLink to="/Certifications" className="nav__link">
              Certifications
            </NavLink>
          </li>
        </ul>
      </nav>
    </header>
  );
}

export default Header;
