package com.fm6mhz.bookshelf.service;

import com.fm6mhz.bookshelf.domain.Author;
import com.fm6mhz.bookshelf.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
