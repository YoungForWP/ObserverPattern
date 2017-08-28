package com.wp;

import com.wp.customer.Customer;
import com.wp.customer.Client;
import com.wp.product.Product;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setColor("red");

        Client a = new Client(product);
        a.setName("a");
        Client b = new Client(product);
        b.setName("b");
        product.setAmount(2);

        System.out.println("------Remove customerB-------");
        product.removeCustomer(b);
        product.setAmount(2);
    }
}
