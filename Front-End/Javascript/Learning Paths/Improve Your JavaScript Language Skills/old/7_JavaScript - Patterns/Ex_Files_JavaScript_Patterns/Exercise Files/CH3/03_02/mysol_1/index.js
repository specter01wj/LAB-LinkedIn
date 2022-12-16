import express from 'express';
import calc from './calc';

const aNum = calc();
const app = express();
const PORT = 3000;

app.get('/', (req, res) =>
    res.send(`Showing number ${aNum} on port ${PORT}`)
);

app.listen(PORT, () =>
    console.log(`your server is running on port ${PORT}`)
);