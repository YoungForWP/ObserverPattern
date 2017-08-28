package com.java.customer;


import com.java.product.Product;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {
    Observable observable;

    private String name;

    public Customer(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Product) {
            Product product = (Product) o;
            System.out.println(this.name + ": I have received that " + product.getColor() + " product is available");
        }
    }
}
