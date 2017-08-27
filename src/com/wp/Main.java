package com.wp;

public class Main {

    public static void main(String[] args) {
        Customer a = new CustomerA(new Product("red"));
        Customer b  = new CustomerB(new Product("black"));

        Product product = new Product();
        product.setCustomer(a);
        product.setCustomer(b);
        product.setAmount("red", 1);
        product.setAmount("black", 2);
    }
}
