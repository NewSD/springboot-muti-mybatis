package com.niu.controller;

import com.niu.entity.Book;
import com.niu.mapper1.BookMapper;
import com.niu.mapper2.BookMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ami on 2019/6/15.
 */
@RestController
public class BookController {
    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookMapper2 bookMapper2;

    @GetMapping("/test1")
    public void test1() {
        List<Book> books1 = bookMapper.getAllBooks();
        List<Book> books2 = bookMapper2.getAllBooks();
        System.out.println("books1" + books1);
        System.out.println("books2" + books2);
    }
}
