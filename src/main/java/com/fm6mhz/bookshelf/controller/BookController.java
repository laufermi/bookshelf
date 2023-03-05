package com.fm6mhz.bookshelf.controller;

import com.fm6mhz.bookshelf.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @RequestMapping("/books")
    public String findAll(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }
}
