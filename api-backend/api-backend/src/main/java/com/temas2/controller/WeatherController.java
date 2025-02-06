package com.temas2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class WeatherController {

    private final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private final String API_KEY = "0d27502bdffb115dc24eaa6d5e8ff3a4";

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
        return restTemplate.getForObject(url, String.class);
    }
}
