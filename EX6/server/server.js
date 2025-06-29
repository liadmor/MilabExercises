const express = require('express');
const request = require("express");
let app = express();

APIKEY = 'PNMOFEIQEYS6YFJX';


function fetchPrice(symbol, cb){

    let url = `https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=${symbol}&apikey=${APIKEY}`

    request.get({
        url: url,
        json: true,
        headers: {'User-Agent': 'request'}
    }, (err, res, data) => {
        if (err) {
            console.log('Error:', err);
        } else if (res.statusCode !== 200) {
            console.log('Status:', res.statusCode);
        } else {
            // data is successfully parsed as a JSON object:
            return cb(null, {
                symbol: symbol,
                price: data['Global Quote']['05. price']
            });

        }
    });
}

app.get('/stock', (req, res, next) => {
    let symbol = req.query.symbol || 'IBM';

    fetchPrice(symbol, (err, price) =>{
        if (err) return res.status(500).json({err: err.message});
        return res.json(price);
    });
});

app.listen(8008, () => {
    console.log(`Listening on port 8080`);
});