package com.proy.entelgyv7.service.rule.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proy.entelgyv7.rest.dto.UserResponse;
import com.proy.entelgyv7.service.proxy.ApiExterna;
import com.proy.entelgyv7.service.rule.UserService;



@Service
public class UserServiceImpl implements UserService{

	private ApiExterna apiExterna;

	@Autowired
	public UserServiceImpl(ApiExterna apiExterna) {
		this.apiExterna = apiExterna;
	}

	@Override
	public UserResponse invocarServicioExterno() {

		UserResponse userResponse =  new UserResponse();
		userResponse.setData(apiExterna
				.getApiExterna()
				.getData()
				.stream()
				.map(val -> val.getId() + "|" + val.getLast_name() + "|" + val.getEmail())
				.collect(Collectors.toList()));

		return userResponse;
	}
}