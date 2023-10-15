import Footer from "../Components/Footer";
import Header from "../Components/Header";
import "./Certifications.css";
function Certifications() {
  return (
    <>
      <Header />
      <div className="certifications">
        <p className="certifications__title">My Certificates</p>

        <div className="certificates">
          <figure className="certificates__first">
            <img
              src="/certificate-1.jpg"
              alt="certificate"
              className="certificates__img"
            />
          </figure>
          <figure className="certificates__first">
            <img
              src="/certificate-2.jpg"
              alt="certificate"
              className="certificates__img"
            />
          </figure>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Certifications;
