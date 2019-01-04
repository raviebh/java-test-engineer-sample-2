package com.att.demo.service;

import com.att.demo.model.Cart;

public interface CartService {

	Cart findCart(long id);

	/**
	 * Prem - changed the return type from void to Cart so that
	 * caller can avoid one more call get to updated data
	 *  
	 * @param cart
	 * @return
	 */
	Cart saveCart(Cart cart);

	/**
	 * Prem - changed the return type to boolean to denote if
	 * the record has been successfully deleted or not
	 * @param id
	 * @return
	 */
	boolean deleteCart(long id);
	
	
	/**
	 * Prem - changed the return type from void to Cart so that
	 * caller can avoid one more call get to updated data
	 *  
	 * @param cart
	 * @return
	 */
	Cart updateCart(Cart cart);

}
