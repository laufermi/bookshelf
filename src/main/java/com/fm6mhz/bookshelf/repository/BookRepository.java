package com.fm6mhz.bookshelf.repository;

import com.fm6mhz.bookshelf.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
