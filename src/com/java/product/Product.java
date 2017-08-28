package com.java.product;

import java.util.Observable;

public class Product extends Observable {
    private String color;
    private Integer amount;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        if (checkNotify(amount)) {
            setChanged();
            notifyObservers();
        }
        this.amount = amount;
    }

    private boolean checkNotify(Integer amount) {
        return (this.amount == null || this.amount == 0) && amount > 0;
    }
}
