package com.elvis.training_labs_personal;

public class ProductAlreadyRegisteredException extends Exception {
    public ProductAlreadyRegisteredException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
