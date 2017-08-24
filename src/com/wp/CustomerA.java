package com.wp;

class CustomerA {
    private Product product;

    CustomerA(Product product) {
        this.product = product;
    }

    Product getProduct() {
        return product;
    }

    void receiveMessage() {
        System.out.println("CustomerA: I have received that " + product.getColor() + " product is available");
    }

}
