package com.att.demo.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.att.demo.model.Cart;
import com.att.demo.service.CartServiceImpl;
/**
 * This is the Controller class for Account mService
 * 
 * 
 */
@Controller
public class CartResourceImpl implements CartResource {
	
	public static final Logger logger = LoggerFactory.getLogger(CartResourceImpl.class);
	
	@Autowired CartServiceImpl CartServiceImpl;
	

	

	@Override
	public Response findCart(InputStream json) {
		
		Map jsonMap = convertJsonStreamtoMap(json);
		long id = (long)jsonMap.get("id");
		Cart cart = CartServiceImpl.findCart(id);
		return Response.ok().entity(cart).build();
	}



	@Override
	public Response saveCart(InputStream json) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Response deleteCart(InputStream json) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Response updateCart(InputStream json) {
		// TODO Auto-generated method stub
		return null;
	}
	

	private Map convertJsonStreamtoMap(InputStream json) {
		ObjectMapper mapper = new ObjectMapper();
		Map jsonMap = new HashMap();
		try { 
			jsonMap = mapper.readValue(json, Map.class);
		} catch (JsonParseException e) {
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonMap;
	}



}