package com.example.emtlibrary.web;

import com.example.emtlibrary.model.enumerations.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "heroku")
@RequestMapping("/api")
public class CategoryRestController {

    @GetMapping
    public List<Category> getCategories(){
        return Arrays.stream(Category.values()).collect(Collectors.toList());
    }

}
