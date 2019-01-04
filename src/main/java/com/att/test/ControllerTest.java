package com.att.test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.att.demo.model.Cart;
import com.att.demo.resource.CartResourceImpl;
import com.att.demo.service.CartServiceImpl;

public class ControllerTest {
	
	CartResourceImpl cartResource;
	CartServiceImpl cartService;
	CartResourceImpl mockedRes;
	
	@Before
	public void setup(){
		this.cartService = new CartServiceImpl();
		this.cartResource = new CartResourceImpl(cartService);
		
		this.mockedRes = mock(CartResourceImpl.class);
	}
	
	@Test
	public void testGet() {
		Cart mockedCart=mock(Cart.class);
		when(mockedRes.getItems(1)).thenReturn(mockedCart);
	}
	
	@Test
	public void testSave(){
		Cart cartToSave=mock(Cart.class);
		when(mockedRes.saveCart(cartToSave)).thenReturn(cartToSave);
		//Add verify to look for saved data
	}
	
	@Test
	public void testUpdate(){
		Cart updatedCart=mock(Cart.class);
		when(mockedRes.updateCart(updatedCart)).thenReturn(updatedCart);
		//Add verify to look for updated data
	}
	
	@Test
	public void testDelete(){
		boolean result = mock(boolean.class);
		when(mockedRes.deleteCart(1)).thenReturn(result);
	}
	

}
