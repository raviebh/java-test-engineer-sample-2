package com.att.demo.service;

import com.att.demo.model.Cart;

public interface CartService {

	Cart findCart(long id);

	void saveCart(Cart cart);

	String deleteCart(long id);

	Cart updateCart(Cart cart);

}
