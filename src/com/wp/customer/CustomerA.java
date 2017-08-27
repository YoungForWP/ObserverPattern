package com.wp.customer;

import com.wp.product.Product;

public class CustomerA implements Customer {
    private Product product;

    public CustomerA(Product product) {
        this.product = product;
        product.registerObserver(this);
    }

    @Override
    public void receiveMessage() {
        System.out.println("CustomerA: I have received that " + product.getColor() + " product is available");
    }

}
