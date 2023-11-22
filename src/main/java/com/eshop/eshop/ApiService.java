package com.eshop.eshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    public String getCategoriesFromApi() {
        String url = "https://aliexpress-datahub.p.rapidapi.com/store_categories?sellerId=231651707";

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "8de515df24mshe06a32f021de14fp12ae8ajsnecbeada72b62");
        headers.set("X-RapidAPI-Host", "aliexpress-datahub.p.rapidapi.com");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }
}
