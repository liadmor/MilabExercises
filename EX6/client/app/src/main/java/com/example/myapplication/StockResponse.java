package com.example.myapplication;

public class StockResponse {

    public boolean isError;
    public String symbol;
    public String stockPrice;

    public StockResponse(boolean isError, String symbol, String stockPrice) {
        this.stockPrice = stockPrice;
        this.isError = isError;
        this.symbol = symbol;
    }
}