package com.java.customer;

import com.java.product.Product;

import java.util.Observable;
import java.util.Observer;

public class CustomerB implements Observer {
    Observable observable;

    public CustomerB(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Product) {
            Product product = (Product) o;
            System.out.println("CustomerA: I have received that " + product.getColor() + " product is available");
        }
    }
}
