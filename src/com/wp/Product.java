package com.wp;

import java.util.HashMap;
import java.util.Map;

class Product {
    private String color;
    private Map<String, Integer> amount;
    private CustomerA customerA;
    private CustomerB customerB;

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
            notifyCustomerA(color);
            notifyCustomerB(color);
        }
    }

    private void notifyCustomerA(String color) {
        String customerColor = customerA.getProduct().getColor();
        if (customerColor.equals(color)) {
            customerA.receiveMessage();
        }
    }

    private void notifyCustomerB(String color) {
        String customerColor = customerB.getProduct().getColor();
        if (customerColor.equals(color)) {
            customerB.receiveMessage();
        }
    }

    String getColor() {
        return color;
    }

    void setCustomerA(CustomerA customerA) {
        this.customerA = customerA;
    }

    void setCustomerB(CustomerB customerB) {
        this.customerB = customerB;
    }
}
