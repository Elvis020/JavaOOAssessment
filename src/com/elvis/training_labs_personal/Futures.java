package com.elvis.training_labs_personal;

import java.util.ArrayList;
import java.util.List;

public class Futures implements MontrealTradedProducts{
    List<Product> listOfFutureProducts = new ArrayList<>();
    int totalQuantitiesOfStocks;

    protected String exchange;
    protected String contractCode;
    protected int month;
    protected int year;
    private double futurePrice = 22.3;

    public Futures(String exchange, String contractCode, int month, int year) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }


    public double getFuturePrice(){
        return futurePrice;
    }

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(!listOfFutureProducts.contains(product)){
            listOfFutureProducts.add(product);
        }else throw new ProductAlreadyRegisteredException("Product already exists.");
    }

    @Override
    public void trade(Product product, int quantity) {
        totalQuantitiesOfStocks += quantity;
    }

    @Override
    public int totalTradeQuantityForDay() {
        return listOfFutureProducts.size();
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return futurePrice * totalQuantitiesOfStocks;
    }
}
