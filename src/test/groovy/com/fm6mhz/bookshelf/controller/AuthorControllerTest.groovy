package com.fm6mhz.bookshelf.controller

import com.fm6mhz.bookshelf.domain.Author
import com.fm6mhz.bookshelf.service.AuthorService
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = AuthorController)
class AuthorControllerTest extends Specification {
    @Autowired
    MockMvc mockMvc

    @SpringBean
    AuthorService authorService = Mock()

    def 'We can get list of all authors'() {
        given:
            authorService.findAll() >> [new Author(id: 1, firstName: 'Eric', lastName: 'Evans',)]
        expect:
            mockMvc.perform(get("/authors"))
                    .andExpect(status().isOk())
    }
}
