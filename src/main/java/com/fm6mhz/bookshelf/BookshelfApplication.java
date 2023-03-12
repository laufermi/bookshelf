package com.fm6mhz.bookshelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BookshelfApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshelfApplication.class, args);
    }

    @RequestMapping("/api/bears")
    public ResponseEntity<List<String>> listBeer() {
        return ResponseEntity.ok(List.of("Polar Bear", "Kodiak"));
    }

}
