const express = require('express');
const fs = require('fs');
const path = require('path');
const app = express();

app.get('/files/:filename',(req,res) => {
    let file = req.params.filename
    let reqPath = path.join(__dirname, `/files/${file}.txt`);
    let readStream = fs.createReadStream(reqPath);
    readStream.pipe(res);
});

app.listen(3000,() => {
    console.log('Example app listening on port 3000!');
});
