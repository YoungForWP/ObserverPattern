package com.java;


import com.java.customer.CustomerA;
import com.java.customer.CustomerB;
import com.java.product.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setColor("blue");

        CustomerA a = new CustomerA(product);
        CustomerB b = new CustomerB(product);

        product.setAmount(2);

        System.out.println("------Remove customerB-------");

        product.deleteObserver(b);
        product.setAmount(2);
    }
}
