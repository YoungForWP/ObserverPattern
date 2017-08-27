package com.wp;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String color;
    private Map<String, Integer> amount;
    private Customer customer;

    Product() {
        amount = new HashMap<>();
    }

    Product(String color) {
        this.color = color;
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

    void setAmount(String color, Integer quantity) {
        addAmount(color, quantity);
    }

    private void notify(Integer quantity, Integer originAmount, String color) {
        if (originAmount <= 0 && quantity > 0) {
            notifyCustomer(color);
        }
    }

    private void notifyCustomer(String color) {
        if (customer.isInterestIn(color)) {
            customer.receiveMessage();
        }
    }

    public String getColor() {
        return color;
    }

    void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
