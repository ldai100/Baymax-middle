package com.baymax.middletier.baymaxmiddletier.controller;


import com.baymax.middletier.baymaxmiddletier.config.AppProperties;
import com.baymax.middletier.baymaxmiddletier.vo.DayCare;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/oauth")
public class OAuthController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppProperties appProperties;

    @RequestMapping(value = "/grant", method = GET)
    public Map<String,String> getUserInfo(@RequestParam("code")String code) throws JsonProcessingException {

        System.out.println(appProperties.getGoogleRequestUrl());

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("code", code);
        map.add("client_id", appProperties.getGoogleClientToken());
        map.add("client_secret", appProperties.getGoogleClientSecret());
        map.add("grant_type", appProperties.getGoogleGrantType());
        map.add("redirect_uri", "http://localhost:8080/oauth/grant");


        HttpEntity<MultiValueMap<String, String>> requestEnty = new HttpEntity<>(map, header);


        ParameterizedTypeReference<Map<String, String>> responseType =
                new ParameterizedTypeReference<Map<String, String>>() {};


        ResponseEntity<Map<String, String>> response = null;
        ResponseEntity<Map<String, String>> infoResponse = null;
        try {
            response = restTemplate.exchange(appProperties.getGoogleRequestUrl(), HttpMethod.POST, requestEnty, responseType);


            infoResponse = restTemplate.exchange("https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token="+response.getBody().get("access_token"),HttpMethod.GET,null,responseType);
            System.out.println(infoResponse);

        }
        catch(Exception e){
            e.printStackTrace();
        }


        System.out.println(response);


        return infoResponse.getBody();
    }


}
