package com.vidal.library.book;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BookServiceAdapter implements BookServicePort {

    private final BookPersistencePort persistence;

    @Override public Book save(Book book) {
        return persistence.save(book);
    }

    @Override public void deleteById(Long id) {
        persistence.deleteById(id);
    }

    @Override public Book findById(Long id) {
        return persistence.findById(id);
    }

    @Override public List<Book> list() {
        return persistence.list();
    }
}
