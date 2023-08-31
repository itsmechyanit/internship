import React, { useEffect, useState } from "react";
import "./Nav.css";
//This is responsible for displaying the top nav
//We will also make it sticky once the user has scrolled down 100 px
function Nav() {
  const [show, handleShow] = useState(false);
  //Attaching the event listener to make the nav sticky after scrolling down 100px
  useEffect(() => {
    window.addEventListener("scroll", () => {
      if (window.scrollY > 100) {
        handleShow(true);
      } else handleShow(false);
    });
    return () => {
      window.removeEventListener("scroll", null);
    };
  }, []);

  //This creates the nav html markUp
  return (
    <div className={`nav ${show && "nav__black"}`}>
      <img
        src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Amazon_Prime_Video_logo.svg/1600px-Amazon_Prime_Video_logo.svg.png?20180717024615"
        alt="Prime Video"
        className="nav__logo"
      />
      <div className="nav__right">
        <span className="nav__right__txt">Chyanit</span>
        <img
          src="https://m.media-amazon.com/images/G/02/CerberusPrimeVideo-FN38FSBD/adult-1.png"
          alt="Prime Video"
          className="nav__right__img"
        />
      </div>
    </div>
  );
}

export default Nav;
