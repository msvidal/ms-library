package com.vidal.library.book;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BookService {

    private final BookPort port;

    public Book save(final Book book) {
        return port.save(book);
    }

    public void deleteById(final Long id) {
        port.deleteById(id);
    }

    public Book findById(final Long id) {
        return port.findById(id);
    }

    public List<Book> list() {
        return port.list();
    }
}
