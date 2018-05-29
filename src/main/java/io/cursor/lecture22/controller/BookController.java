package io.cursor.lecture22.controller;

import io.cursor.lecture22.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Value("${video.link}")
    private String linkVideo;

    @GetMapping("/")
    public String getUnderstandingWhyYouShouldDoHardWork() {
        return "<a href=\""+linkVideo+"\" target=\"_blank\">just press me</a>";
    }
}
