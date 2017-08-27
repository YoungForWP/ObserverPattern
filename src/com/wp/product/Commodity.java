package com.wp.product;

import com.wp.customer.Customer;

public interface Commodity {
    void registerObserver(Customer customer);
    void notifyCustomer(String color);
    void removeCustomer(Customer customer);
}
