package com.wua.wiseup.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Controller
public class BootStrapImage {

    @GetMapping("/bootStrap")
    public String showBootStrap() {
        return "bootStrap.html";
    }

    @RequestMapping("/get")
    public void get(){
        String testUrl = "https://openapi.naver.com/v1/datalab/shopping/category/device";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(testUrl, String.class); // TODO String 말고
    }

    private String jsonStringFromObject(Object object) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
