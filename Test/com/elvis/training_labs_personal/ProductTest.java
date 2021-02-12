package com.elvis.training_labs_personal;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductTest {
    Futures f1 = new Futures("Gold","21G",2,2020);
    Product product1 = new Product(211,f1);

    @Mock
    Futures futures;
    Product product;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void price() {
    }

    @Test
    public void testPrice() {
    }

    @Test
    public void addNewProduct() {
        List<Product> requiredR = Arrays.asList(product1);


        assertArrayEquals();
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