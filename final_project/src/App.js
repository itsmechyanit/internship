import { BrowserRouter, Route, Routes } from "react-router-dom";

import Certifications from "./Pages/Certifications";
import Education from "./Pages/Education";
import Experience from "./Pages/Experience";
import Skills from "./Pages/Skills";
import HomePage from "./Pages/HomePage";

import Html from "./Components/Html";
import Javascript from "./Components/Javascript";
import React from "./Components/React";
import Projects from "./Pages/Projects";
import { Navigate } from "react-router-dom";

function App() {
  return (
    // <div className="App">
    //   <Header />
    //   <Hero />
    //   <Experience />
    //   <Education />
    //   <Skills />
    //   <Certifications />
    // </div>

    <BrowserRouter>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="experience" element={<Experience />} />
        <Route path="education" element={<Education />} />
        <Route path="skills" element={<Skills />} />
        <Route path="certifications" element={<Certifications />} />
        <Route path="projects" element={<Projects />}>
          <Route index element={<Navigate to="html-css" replace />} />
          <Route path="html-css" element={<Html />} />
          <Route path="javascript" element={<Javascript />} />
          <Route path="react" element={<React />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
