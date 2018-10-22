package com.att.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Cart",
description = "Cart domain object")
public class Cart implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	@NotEmpty
	private Long cartId;
	private Date createdDate;
	private Date completedDate;
	@NotNull
	private List<Item> items;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Cart(Long cartId, Date createdDate, Date completedDate, List<Item> items) {
		super();
		this.cartId = cartId;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
		this.items = items;
	}



	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", createdDate=" + createdDate + ", completedDate=" + completedDate
				+ ", items=" + items + "]";
	}
	

}
