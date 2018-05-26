package io.cursor.lecture22.controller;

import io.cursor.lecture22.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/")
    public String getUnderstandingWhyYouShouldDoHardWork() {
        return "<a href=\"https://youtu.be/8EGWEUf9Xr8\" target=\"_blank\">just press me</a>";
    }
}
