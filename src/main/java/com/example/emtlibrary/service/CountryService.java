package com.example.emtlibrary.service;

import com.example.emtlibrary.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();

    Country save(String name, String continent);

}
