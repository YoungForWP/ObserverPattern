package com.wp;

class CustomerB {
    private Product product;

    CustomerB(Product product) {
        this.product = product;
    }

    Product getProduct() {
        return product;
    }

    void receiveMessage() {
        System.out.println("CustomerB: I have received that " + product.getColor() + " product is available");
    }
}
