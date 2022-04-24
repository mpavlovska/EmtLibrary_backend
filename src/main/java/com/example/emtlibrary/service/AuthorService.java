package com.example.emtlibrary.service;

import com.example.emtlibrary.model.Author;
import com.example.emtlibrary.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();

    Optional<Author> findById(Long id);

    Optional<Author> findByNameAndSurname(String name, String surname);

    Author create(String name, String surname, Country country);

    Optional<Author> update(Long id, String name, String surname, Country country);

    void deleteById(Long id);
}
