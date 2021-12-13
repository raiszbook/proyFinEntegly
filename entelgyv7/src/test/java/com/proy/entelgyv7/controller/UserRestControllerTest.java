package com.proy.entelgyv7.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.proy.entelgyv7.rest.UserRestController;
import com.proy.entelgyv7.rest.dto.UserResponse;
import com.proy.entelgyv7.service.rule.UserService;



@WebMvcTest(UserRestController.class)
public class UserRestControllerTest {
	
	public static UserResponse userResponse = new UserResponse();

	 @Autowired
	 private UserService userService;
    
    @Test
	public void generarDataTest() throws Exception{
    	
    	userResponse = userService.invocarServicioExterno();
     
        
    }
    
}