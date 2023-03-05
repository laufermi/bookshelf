package com.fm6mhz.bookshelf.service;

import com.fm6mhz.bookshelf.domain.Publisher;
import com.fm6mhz.bookshelf.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherService {
    private final PublisherRepository publisherRepository;

    public Iterable<Publisher> findAll(){
        return publisherRepository.findAll();
    }
}
