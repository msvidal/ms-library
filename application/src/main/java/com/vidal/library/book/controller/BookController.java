package com.vidal.library.book.controller;

import com.vidal.library.book.Book;
import com.vidal.library.book.BookServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServicePort bookServicePort;

    @PostMapping()
    public Book save(@RequestBody Book book) {
        return bookServicePort.save(book);
    }

    @PutMapping("")
    public Book update(@RequestBody Book book) {
        return bookServicePort.save(book);
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return bookServicePort.findById(id);
    }

    @GetMapping()
    public List<Book> list() {
        return bookServicePort.list();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        bookServicePort.deleteById(id);
    }
}
