package com.temas2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BankController {

    private final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    @GetMapping("/exchange-rate")
    public String getExchangeRate(@RequestParam String base, @RequestParam String target) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + base;
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
