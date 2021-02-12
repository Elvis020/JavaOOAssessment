package com.elvis.training_labs_personal;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StocksTest {
    @Mock
    MontrealTradedProducts montrealTradedProducts;
    ProductPricingService productPricingService;

    @Test
    public void addNewProduct() throws ProductAlreadyRegisteredException {
//        Stocks
        Stocks stock1 = new Stocks("Gold1","G2111");
        Stocks stock2 = new Stocks("Gold1","G2111");
//        Futures
        Futures futures1 = new Futures("Alumi1","A2311",2,2020);
        Futures futures2 = new Futures("Alumi1","A2311",2,2020);

//        Products
        Product product1 = new Product(21,stock1);
        Product product3 = new Product(21,stock1);
        Product product4 = new Product(21,futures1);
        Mockito.when(montrealTradedProducts.addNewProduct(product2))).thenThrow(ProductAlreadyRegisteredException.class);
    }

    @Test
    public void trade() {
    }

    @Test
    public void totalTradeQuantityForDay() {
    }

    @Test
    public void totalValueOfDaysTradedProducts() {
    }
}