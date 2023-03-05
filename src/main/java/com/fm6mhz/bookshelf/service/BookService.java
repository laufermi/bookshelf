package com.fm6mhz.bookshelf.service;

import com.fm6mhz.bookshelf.domain.Book;
import com.fm6mhz.bookshelf.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
