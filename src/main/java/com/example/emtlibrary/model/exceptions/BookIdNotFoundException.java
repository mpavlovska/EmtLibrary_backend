package com.example.emtlibrary.model.exceptions;

public class BookIdNotFoundException extends RuntimeException{
    public BookIdNotFoundException(Long id){
        super("Book with id: "+id+" not found!");
    }
}
