import { NavLink } from "react-router-dom";
import "./ProjectList.css";

function ProjectList() {
  return (
    <div className="projects">
      <p className="projects__title">My Projects</p>
      <ul className="projects__list">
        <li className="projects__item">
          <NavLink to="html-css" className="projects__link">
            HTML & CSS
          </NavLink>
        </li>
        <li className="projects__item">
          <NavLink to="javascript" className="projects__link">
            JAVASCRIPT
          </NavLink>
        </li>
        <li className="projects__item">
          <NavLink to="react" className="projects__link">
            REACT
          </NavLink>
        </li>
      </ul>
    </div>
  );
}

export default ProjectList;
