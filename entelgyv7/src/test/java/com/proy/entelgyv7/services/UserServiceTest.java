package com.proy.entelgyv7.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.proy.entelgyv7.rest.dto.UserResponse;
import com.proy.entelgyv7.service.rule.impl.UserServiceImpl;


public class UserServiceTest {

	public static final UserResponse USERRESPONSE = new UserResponse();
	private static final List<String> DATA = new ArrayList<>();
	
	@Mock
	private UserResponse userResponse;

	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	
	@Before
	public void init() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		USERRESPONSE.setData(DATA); 
	}
	
	@Test
	public void invocarServicioExternoTest() throws Exception{
	
		Mockito.when(userServiceImpl.invocarServicioExterno());
	}
	
}