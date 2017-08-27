package com.wp.customer;

import com.wp.product.Product;

public class CustomerB implements Customer {
    private Product product;

    public CustomerB(Product product) {
        this.product = product;
        product.registerObserver(this);
    }

    @Override
    public void receiveMessage() {
        System.out.println("CustomerB: I have received that " + product.getColor() + " product is available");
    }

}
