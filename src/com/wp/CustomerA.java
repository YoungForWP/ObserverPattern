package com.wp;

class CustomerA implements Customer {
    private Product product;

    CustomerA(Product product) {
        this.product = product;
    }

    Product getProduct() {
        return product;
    }

    @Override
    public void receiveMessage() {
        System.out.println("CustomerA: I have received that " + product.getColor() + " product is available");
    }

    @Override
    public boolean isInterestIn(String color) {
        return product.getColor().equals(color);
    }

}
