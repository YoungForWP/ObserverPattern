package com.wp;

import com.wp.customer.Customer;
import com.wp.customer.CustomerA;
import com.wp.customer.CustomerB;
import com.wp.product.Product;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setColor("red");

        Customer a = new CustomerA(product);
        Customer b  = new CustomerB(product);

        product.setAmount("red", 1);
        product.setAmount("black",2);

        System.out.println("------Remove customerB-------");
        product.removeCustomer(b);
        product.setAmount("red", -1);
        product.setAmount("red", 1);
    }
}
