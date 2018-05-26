package io.cursor.lecture22.controller;

import io.cursor.lecture22.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/")
    public List<Book> getBook() {
        return Arrays.asList(new Book(1,"Harry Potter","Fantastic"));
    }

}
