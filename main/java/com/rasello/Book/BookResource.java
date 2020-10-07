package com.rasello.Book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BookResource {


@RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> getBookInfo(){

    System.out.println("Welcome to BookPage!");
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

        return  books;

    }
}
