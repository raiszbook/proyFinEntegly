package com.proy.entelgyv7.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proy.entelgyv7.rest.dto.UserResponse;
import com.proy.entelgyv7.service.rule.UserService;


@RestController
public class UserRestController {

	private UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping(value = "/usuario")
	public UserResponse generarData() {
		
		return userService.invocarServicioExterno();
		
	}
	
}
	