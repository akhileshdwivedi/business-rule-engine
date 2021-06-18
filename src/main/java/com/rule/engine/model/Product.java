package com.rule.engine.model;

public enum Product {
    PHYSICAL_PRODUCT("Physical product"),
    BOOK("Book"),
    VIDEO("video"),
    MEMBERSHIP("Membership");

    private final String product;

    Product(String product) {
        this.product = product;

    }

    public String getProduct() {
        return product;
    }
}
