package com.vidal.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookJpaAdapter implements BookPersistencePort {

    @Autowired
    private BookRepository repository;

    @Override
    public Book save(Book book) {

        if(book == null) {
            throw new IllegalArgumentException();
        }

        return BookEntity.toDomain(repository.save(BookEntity.from(book)));
    }

    @Override
    public void deleteById(Long id) {
        if(id == null) {
            throw new IllegalArgumentException();
        }

        repository.deleteById(id);
    }

    @Override
    public Book findById(Long id) {

        if(id == null) {
            throw new IllegalArgumentException();
        }

        Optional<BookEntity> bookEntity = repository.findById(id);

        if(!bookEntity.isPresent()){
            return null;
        }

        return BookEntity.toDomain(bookEntity.get());
    }

    @Override public List<Book> list()
    {
        return repository.findAll().stream().map(BookEntity::toDomain).collect(Collectors.toList());
    }

}
