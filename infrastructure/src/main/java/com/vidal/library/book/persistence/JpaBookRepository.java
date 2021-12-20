package com.vidal.library.book.persistence;

import com.vidal.library.book.Book;
import com.vidal.library.book.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class JpaBookRepository implements BookRepository {

    private final com.vidal.library.book.persistence.BookRepository repository;

    @Override
    public Book save(final Book book) {

        if(book == null) {
            throw new IllegalArgumentException();
        }

        return BookEntity.toDomain(repository.save(BookEntity.from(book)));
    }

    @Override
    public void deleteById(final Long id) {
        if(id == null) {
            throw new IllegalArgumentException();
        }

        repository.deleteById(id);
    }

    @Override
    public Book findById(final Long id) {

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
