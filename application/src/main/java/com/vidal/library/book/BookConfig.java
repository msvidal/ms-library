package com.vidal.library.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookService bookService(final BookRepository port){
        return new BookService(port);
    }
}
