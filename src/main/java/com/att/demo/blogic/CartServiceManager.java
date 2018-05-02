/**
 * 
 */
package com.att.demo.blogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.att.demo.model.Cart;

/**
 * CartServiceManager.java
 *
 */
@Component
public class CartServiceManager {
	
	@Autowired
	LocalRepo dataRepo;
	
	public Cart findCart(long id) {
		Cart returnCart = dataRepo.getCartById(id);
		
		return returnCart;
		
	}

	public Cart saveCart(Cart cart) {
		return dataRepo.addCart(cart.getCartId(), cart);
	}

	public Cart deleteCart(long id) {
		return dataRepo.removeCart(id);
		
	}

	public Cart updateCart(Cart cart) {
		return dataRepo.updateCart(cart.getCartId(), cart);
	}	
}
