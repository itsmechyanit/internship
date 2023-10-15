import { Outlet } from "react-router-dom";
import Header from "../Components/Header";
import ProjectList from "../Components/ProjectList";
import Footer from "../Components/Footer";

function Projects() {
  return (
    <>
      <Header />
      <ProjectList />
      <Outlet />
      <Footer />
    </>
  );
}

export default Projects;
