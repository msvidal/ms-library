package com.vidal.library.book;

import java.util.List;

public interface BookPersistencePort {

    Book save(Book book);

    void deleteById(Long id);

    Book findById(Long id);

    List<Book> list();

}
