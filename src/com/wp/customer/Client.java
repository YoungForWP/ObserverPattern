package com.wp.customer;

import com.wp.product.Product;

public class Client implements Customer {
    private String name;
    private Product product;

    public Client(Product product) {
        this.product = product;
        product.registerObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void receiveMessage() {
        System.out.println(this.name + ": I have received that " + product.getColor() + " product is available");
    }

    public void cancelInterest() {
        product.removeCustomer(this);
    }

}
