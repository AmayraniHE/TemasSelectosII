package com.temas2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BooksController {

    private final String API_URL = "https://www.googleapis.com/books/v1/volumes?q=";

    @GetMapping("/books")
    public String searchBooks(@RequestParam String query) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + query;
        return restTemplate.getForObject(url, String.class);
    }
}
