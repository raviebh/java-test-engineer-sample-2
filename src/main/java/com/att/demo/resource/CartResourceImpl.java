package com.att.demo.resource;

import com.att.demo.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.apache.commons.lang3.StringUtils;


/**
 * This is the Controller class for Account mService
 * 
 * 
 */
@Controller

public class CartResourceImpl implements CartResource {
	
	public static final Logger logger = LoggerFactory.getLogger(CartResourceImpl.class);


	@Override
	public ResponseEntity getCartDetails(String cartId) {

		if (StringUtils.isEmpty(cartId)) {
			  return new ResponseEntity<>(
					"CartId cannot be Null",
					HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<>(
					"Item added to cart",
					HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity addtoCart(String cartId, Item itemToAdd) {
		return null;
	}

	@Override
	public ResponseEntity removeItemFromCart(String cartId, Item itemToRemove) {
		return null;
	}

	@Override
	public ResponseEntity updateItemInCart(String cartId, Item itemToRemove) {
		return null;
	}
}