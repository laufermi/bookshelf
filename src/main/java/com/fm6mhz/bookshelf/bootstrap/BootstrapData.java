package com.fm6mhz.bookshelf.bootstrap;

import com.fm6mhz.bookshelf.domain.Author;
import com.fm6mhz.bookshelf.domain.Book;
import com.fm6mhz.bookshelf.domain.Publisher;
import com.fm6mhz.bookshelf.repository.AuthorRepository;
import com.fm6mhz.bookshelf.repository.BookRepository;
import com.fm6mhz.bookshelf.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = Author.builder()
                .firstName("Eric")
                .lastName("Evans")
                .build();

        Book ddd = Book.builder()
                .title("Domain Driven Design")
                .isbn("9780321125217")
                .build();

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author robert = Author.builder()
                .firstName("Robert")
                .lastName("Martin")
                .build();
        Book cleanArch = Book.builder()
                .title("Clean Architecture")
                .isbn("9787121347962")
                .build();

        Author robertSaved = authorRepository.save(robert);
        Book cleanArchSaved = bookRepository.save(cleanArch);

        ericSaved.getBooks().add(dddSaved);
        robertSaved.getBooks().add(cleanArchSaved);
        dddSaved.getAuthors().add(ericSaved);
        cleanArchSaved.getAuthors().add(robertSaved);

        Publisher pearson = Publisher.builder()
                .name("Pearson")
                .address("330 Hudson")
                .city("New York")
                .state("New York")
                .zip("12534")
                .build();
        Publisher pearsonSaved = publisherRepository.save(pearson);

        dddSaved.setPublisher(pearsonSaved);
        cleanArchSaved.setPublisher(pearsonSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(robertSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(cleanArchSaved);





        log.info("In Bootstrap");
        log.info("Authors: {}", authorRepository.count());
        log.info("Books: {}", bookRepository.count());
        log.info("Publishers: {}", publisherRepository.count());
    }
}
