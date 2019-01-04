package com.att.demo.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Cart",
description = "Cart domain object")
public class Cart implements Serializable{

    int cartId;

    String createdDate;

    String completedDate;

    List<Item> items;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    public List<Item> getItem() {
        return items;
    }

    public void setItem(List<Item> item) {
        this.items = item;
    }

    public Cart(int cartId, String createdDate, String completedDate, List<Item> item) {
        this.cartId = cartId;
        this.createdDate = createdDate;
        this.completedDate = completedDate;
        this.items = item;
    }
}
