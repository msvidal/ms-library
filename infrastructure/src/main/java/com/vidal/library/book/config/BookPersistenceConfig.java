package com.vidal.library.book.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.vidal.library.book.persistence")
public class BookPersistenceConfig {

}
