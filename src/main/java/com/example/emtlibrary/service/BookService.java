package com.example.emtlibrary.service;

import com.example.emtlibrary.model.Book;
import com.example.emtlibrary.model.enumerations.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> addBook(String name, Category category, Long authorId, Integer availableCopies);

    Optional<Book> editBook(Long id, String name, Category category, Long authorId, Integer availableCopies);

    void deleteById(Long id);

    Optional<Book> taken(Long id);
}
