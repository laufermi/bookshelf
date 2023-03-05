package com.fm6mhz.bookshelf.controller;

import com.fm6mhz.bookshelf.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @RequestMapping("/authors")
    public String findAll(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
