package com.wp;

class CustomerB implements Customer {
    private Product product;

    CustomerB(Product product) {
        this.product = product;
    }

    private Product getProduct() {
        return product;
    }

    @Override
    public void receiveMessage() {
        System.out.println("CustomerB: I have received that " + product.getColor() + " product is available");
    }

    @Override
    public boolean isInterestIn(String color) {
        return product.getColor().equals(color);
    }
}
