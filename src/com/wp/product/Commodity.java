package com.wp.product;

import com.wp.customer.Customer;

public interface Commodity {
    void registerObserver(Customer customer);
    void notifyCustomer();
    void removeCustomer(Customer customer);
}
