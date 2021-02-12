package com.elvis.training_labs_personal;

import java.util.ArrayList;
import java.util.List;

public class Product implements ProductPricingService {
    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    private List<Product> listOfProducts = new ArrayList<>();

    protected int productID;
    Stocks stocks;
    Futures futures;

    public Product(int productID, Futures futures) {
        this.productID = productID;
        this.futures = futures;
    }

    public Product(int productID, Stocks stocks) {
        this.productID = productID;
        this.stocks = stocks;
    }

    @Override
    public double price(String exchange, String ticker) {
        return stocks.getStockPrice();
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return futures.getFuturePrice();
    }

}
