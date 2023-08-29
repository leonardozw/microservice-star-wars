import express from 'express';
import httpProxy from 'express-http-proxy';

const app = express();
const PORT = process.env.PORT || 3000;

const starWarsMovieApi = httpProxy("http://localhost:8081")
const starWarsCharacterApi = httpProxy("http://localhost:8082")

app.use("/api/movies", (req, res, next) => {
    return starWarsMovieApi(req, res, next);
})

app.use("/api/characters", (req, res, next) => {
    return starWarsCharacterApi(req, res, next);
})

app.listen(PORT, () => {
    console.log(`Server listening on port ${PORT}`);
});