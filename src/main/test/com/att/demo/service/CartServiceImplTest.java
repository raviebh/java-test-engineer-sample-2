package com.att.demo.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.att.demo.model.Cart;
import com.att.demo.model.Item;

@RunWith(MockitoJUnitRunner.class)
public class CartServiceImplTest {
	private CartServiceImpl serviceMock;
	@Before
	public void setup() {
		serviceMock = Mockito.mock(CartServiceImpl.class);
	}
	
	@Test
	public void findCartById() {
		Cart cart = serviceMock.findCart(1L);
		assertEquals(1L, cart.getCartId());
	}
	
	@Test
	public void saveNullCart() {
		ResponseEntity<T> response = serviceMock.saveCart(null);
		
		assertEquals(response.getStatusCodeValue(), 404);
	}
	
	@Test
	public void updateCart() {
		ResponseEntity<T> response = serviceMock.saveCart(new Cart(1L, new Date(), new Date(), 
				new Item(101L, "item1", 1, 20, 1L)));
		Cart cart = response.getBody();
		assertEquals(cart.getCartId(), 1L);
	}

}
