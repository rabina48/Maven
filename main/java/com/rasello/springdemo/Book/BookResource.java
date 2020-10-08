package com.rasello.springdemo.Book;

import com.rasello.springdemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookResource {

    private final BookService bookservices;

    public BookResource(BookService bookservices) {
        this.bookservices = bookservices;
    }


    @GetMapping(value = "/book")
    public List<Book> getBookInfo() {

        List<Book> books = bookservices.getBookData();

        return books;

    }



}
