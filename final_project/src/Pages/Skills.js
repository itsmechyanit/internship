import Footer from "../Components/Footer";
import Header from "../Components/Header";
import "./Skills.css";
function Skills() {
  return (
    <>
      <Header />
      <p className="title skill-title">My Skills</p>
      <div className="skill">
        <div className="skill-1">
          <div className="skill__container">
            <h6 className="skill__title">HTML</h6>
            <div className="skill__progress">
              <span className="skill__percentage html"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">CSS</h6>
            <div className="skill__progress">
              <span className="skill__percentage css"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">JAVASCRIPT</h6>
            <div className="skill__progress">
              <span className="skill__percentage javascript"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">REACT</h6>
            <div className="skill__progress">
              <span className="skill__percentage react"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">ANGULAR</h6>
            <div className="skill__progress">
              <span className="skill__percentage angular"></span>
            </div>
          </div>
        </div>
        <div className="skill-2">
          <div className="skill__container">
            <h6 className="skill__title">PYTHON</h6>
            <div className="skill__progress">
              <span className="skill__percentage python"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">JAVA</h6>
            <div className="skill__progress">
              <span className="skill__percentage java"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">C++</h6>
            <div className="skill__progress">
              <span className="skill__percentage c"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">NODE</h6>
            <div className="skill__progress">
              <span className="skill__percentage node"></span>
            </div>
          </div>
          <div className="skill__container">
            <h6 className="skill__title">RUBY</h6>
            <div className="skill__progress">
              <span className="skill__percentage ruby"></span>
            </div>
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Skills;
