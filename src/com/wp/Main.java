package com.wp;

public class Main {

    public static void main(String[] args) {
        CustomerA a = new CustomerA(new Product("red"));
        CustomerB b  = new CustomerB(new Product("black"));

        Product product = new Product();
        product.setCustomerA(a);
        product.setCustomerB(b);
        product.setAmount("red", 1);
        product.setAmount("black", 0);
    }
}
