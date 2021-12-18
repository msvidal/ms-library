package com.vidal.library.book.config;

import com.vidal.library.book.BookJpaAdapter;
import com.vidal.library.book.BookPersistencePort;
import com.vidal.library.book.BookServiceAdapter;
import com.vidal.library.book.BookServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookServicePort bookServicePort(){
        return new BookServiceAdapter(bookPersistence());
    }

    @Bean
    public BookPersistencePort bookPersistence(){
        return new BookJpaAdapter();
    }
}
