package com.wp.product;

import com.wp.customer.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Product implements Commodity {
    private String color;
    private Map<String, Integer> amount;
    private ArrayList<Customer> customers;

    public Product() {
        amount = new HashMap<>();
        customers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void notifyCustomer(String color) {
        for (Customer customer : customers) {
            if (customer.isInterestIn(color)) {
                customer.receiveMessage();
            }
        }
    }

    @Override
    public void removeCustomer(Customer customer) {
        int index = customers.indexOf(customer);
        if (index > -1) {
            customers.remove(index);
        }
    }

    private void addAmount(String color, Integer quantity) {
        Integer originAmount = 0;
        if (amount.containsKey(color)) {
            originAmount = amount.get(color);
            quantity += originAmount;
        }
        amount.put(color, quantity);
        notify(quantity, originAmount, color);
    }

    public void setAmount(String color, Integer quantity) {
        addAmount(color, quantity);
    }

    private void notify(Integer quantity, Integer originAmount, String color) {
        if (originAmount <= 0 && quantity > 0) {
            notifyCustomer(color);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
