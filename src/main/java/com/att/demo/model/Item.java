package com.att.demo.model;

public class Item {
    int itemId;
    int cartId;
    String itemIdentifier;
    String name;
    String quantity;
    String price;

    public String getItemIdentifier() {
        return itemIdentifier;
    }

    public void setItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Item(int id, int cartId, String itemIdentifier, String name, String quantity, String price) {
        this.itemId = id;
        this.cartId = cartId;
        this.itemIdentifier = itemIdentifier;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
