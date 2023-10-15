import "./Hero.css";
function Hero() {
  return (
    <div className="hero">
      <div className="hero__text-box">
        <div className="hero__user">
          <span>
            <ion-icon name="person-add-outline" class="hero__icon"></ion-icon>
          </span>
        </div>
        <h2 className="hero__title">
          Hi, I’m <span>Chyanit</span>
        </h2>
        <p className="hero__description">
          An aspiring CyberSecurity professional and a Full Stack developer
        </p>
        <div className="hero__user-info">
          <div className="info">
            <ion-icon name="document-outline" class="hero__icon"></ion-icon>
            <span>CyberSecurity Analyst & FullStack Developer</span>
          </div>
          <div className="info">
            <ion-icon name="mail-outline" class="hero__icon"></ion-icon>
            <span>itsmechyanit@gmail.com</span>
          </div>
          <div className="info">
            <ion-icon name="location-outline" class="hero__icon"></ion-icon>
            <span>Moradabad, India</span>
          </div>
          <div className="info">
            <ion-icon name="call-outline" class="hero__icon"></ion-icon>
            <span>+919412800531</span>
          </div>
        </div>
      </div>
      <div className="hero__img-box">
        <figure>
          &nbsp;
          {/* <img src="./MyPicture.jpg" alt="Chyanit" className="hero__img" /> */}
        </figure>
      </div>
    </div>
  );
}

export default Hero;
