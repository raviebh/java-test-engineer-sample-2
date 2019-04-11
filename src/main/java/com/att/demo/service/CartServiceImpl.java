package com.att.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.springframework.stereotype.Service;

import com.att.demo.model.Cart;
import com.att.demo.resource.CartResource;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;



@Service("cartService")
public class CartServiceImpl implements CartService{
	
	public static Map<String, String> CartMap;
	private static long carCount =  2;
	static {
		
		CartMap = new HashMap<>();
		CartMap.put("cartId", "1");
		CartMap.put("createdDate",  "createdDate");
	}



	@Override
	public Cart findCart(long id) {
		for (Cart cart : CartMap) {
			 if (cart.getCartId() == id) {
			 return cart;
			 }
			 }
			 return null;
	}

	@Override
	public void saveCart(Cart cart) {
		if (cart.getCartId() == null)
		 {
			cart.setCartId(++carCount);
		 }
		CartMap.add(cart);
		 return cart;
		
	}

	@Override
	public void deleteCart(long id) {


		Iterator<User> iterator = CartMap.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
	}

		
	}

	@Override
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}


class DAMapper implements RowMapper<Da>{

	@Override
	public CartResource mapRow(ResultSet resultSet, int i) throws SQLException {
		/*Da da = new Da();
		da.setDa(resultSet.getString("DA"));
		return da;*/
	}



}
