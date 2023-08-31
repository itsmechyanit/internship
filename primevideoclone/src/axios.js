import axios from "axios";

//We are using axios for sending requests asynchronously
const instance = axios.create({
  baseURL: "https://api.themoviedb.org/3",
});

export default instance;
