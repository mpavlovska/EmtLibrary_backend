package com.example.emtlibrary.web;

import com.example.emtlibrary.model.Country;
import com.example.emtlibrary.service.CountryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "heroku")
@RequestMapping("/api")
public class CountyRestController {

    private final CountryService countryService;


    public CountyRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> findAll(){
        return this.countryService.findAll();
    }

}

