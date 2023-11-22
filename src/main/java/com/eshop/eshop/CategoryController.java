package com.eshop.eshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategoryController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/category")
    public String categoryData() {
        return apiService.getCategoriesFromApi();
    }
}
