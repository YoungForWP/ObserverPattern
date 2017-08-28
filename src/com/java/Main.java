package com.java;


import com.java.customer.Customer;
import com.java.product.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setColor("blue");

        Customer a = new Customer(product);
        a.setName("A");

        Customer b = new Customer(product);
        b.setName("B");

        product.setAmount(0);

        System.out.println("------Remove customerB-------");

        b.cancelInterest();
        product.setAmount(2);
    }
}
