package com.fm6mhz.bookshelf.repository;

import com.fm6mhz.bookshelf.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
