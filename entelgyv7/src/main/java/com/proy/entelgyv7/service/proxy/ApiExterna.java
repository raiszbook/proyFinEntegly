package com.proy.entelgyv7.service.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.proy.entelgyv7.properties.ApplicationProperties;
import com.proy.entelgyv7.service.dto.UserDTOResponse;



@Component
public class ApiExterna {

    private ApplicationProperties applicationProperties;
    private RestTemplate externalRestTemplate;

    @Autowired
    public ApiExterna(ApplicationProperties applicationProperties, RestTemplate externalRestTemplate) {
        this.applicationProperties = applicationProperties;
        this.externalRestTemplate = externalRestTemplate;
    }

    public UserDTOResponse getApiExterna() {

        return externalRestTemplate.getForObject(applicationProperties.getUrl(), UserDTOResponse.class);
    }

}