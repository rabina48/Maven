package com.rasello.springdemo.services;

import com.rasello.springdemo.Book.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {

    public List<Book> getBookData(){

        List<Book> books = new ArrayList<>();
        Book bookInfo = new Book();
        bookInfo.setBookId("AGYU1014");
        bookInfo.setBookName("JavaCode");
        bookInfo.setBookNum(147);
        bookInfo.setBookPublication("NepalPublication");

        Book bookInfo1 = new Book();
        bookInfo1.setBookId("ABHU014");
        bookInfo1.setBookName("COde");
        bookInfo1.setBookNum(17);
        bookInfo1.setBookPublication("NepalPublication");

        Book bookInfo2 = new Book();
        bookInfo2.setBookId("AGYU1014");
        bookInfo2.setBookName("English");
        bookInfo2.setBookNum(7);
        bookInfo2.setBookPublication("NepalPublication");
        books.add(bookInfo);
        books.add(bookInfo1);
        books.add(bookInfo2);

        return books;
    }

}
