package com.att.demo.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.att.demo.model.Cart;
import com.att.demo.service.CartServiceImpl;

import io.swagger.annotations.Api;

/**
 * This is the Controller class for Account mService
 * 
 * 
 */
@RestController
@Api
public class CartResourceImpl implements CartResource {
	
	public static final Logger logger = LoggerFactory.getLogger(CartResourceImpl.class);
	

	@Autowired
	CartServiceImpl cartServiceImpl;
	
	public CartResourceImpl(CartServiceImpl cartServiceImpl) {
		super();
		this.cartServiceImpl = cartServiceImpl;
	}

	@Override
	public Cart getItems(long cartId) {
		return cartServiceImpl.findCart(cartId);
	}

	@Override
	public Cart saveCart(Cart cart) {
		//Add logic to handle ServiceException
		return cartServiceImpl.saveCart(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return cartServiceImpl.updateCart(cart);
	}

	@Override
	public Object deleteCart(long cartId) {
		boolean isDeleted = cartServiceImpl.deleteCart(cartId);
		
		if(isDeleted){
			//return Success response error msg
			return true;
		}else{
			//return failure response error msg
			return false;
		}
	}
	
	
	
		

}