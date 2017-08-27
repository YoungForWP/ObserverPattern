package com.wp.product;

import com.wp.customer.Customer;

import java.util.ArrayList;

public class Product implements Commodity {
    private String color;
    private Integer amount;

    private ArrayList<Customer> customers;

    public Product() {
        customers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void notifyCustomer() {
        for (Customer customer : customers) {
                customer.receiveMessage();
        }
    }

    @Override
    public void removeCustomer(Customer customer) {
        int index = customers.indexOf(customer);
        if (index > -1) {
            customers.remove(index);
        }
    }

    public void setAmount(Integer amount) {
        notifyCustomer();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
