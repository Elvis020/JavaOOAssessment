package com.elvis.training_labs_personal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stocks implements MontrealTradedProducts  {

    List<Product> listOfStocksProducts = new ArrayList<>();
    int totalQuantitiesOfStocks;
    protected String exchange;
    protected String ticker;
    private double stockPrice = 22.3;

    public Stocks(String exchange, String ticker) {
        this.exchange = exchange;
        this.ticker = ticker;
    }


    public double getStockPrice(){
        return stockPrice;
    }

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(!listOfStocksProducts.contains(product)){
            listOfStocksProducts.add(product);
        }else throw new ProductAlreadyRegisteredException("Product already exists.");
    }

    @Override
    public void trade(Product product, int quantity) {
        ////        Getting the product ID
        int productIDForChecking = product.productID;
        double initialQuantity = 0.0;
        List<Product> acceptedProduct =
                listOfStocksProducts.stream()
                        .filter(x -> x.productID != productIDForChecking)
                        .collect(Collectors.toList());
        totalQuantitiesOfStocks += quantity;

    }

    @Override
    public int totalTradeQuantityForDay() {
        return listOfStocksProducts.size();
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return stockPrice * totalQuantitiesOfStocks;
    }
}
