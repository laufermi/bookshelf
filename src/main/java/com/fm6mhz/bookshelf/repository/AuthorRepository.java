package com.fm6mhz.bookshelf.repository;

import com.fm6mhz.bookshelf.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
