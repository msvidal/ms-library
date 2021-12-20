package com.vidal.library.book.controller;

import com.vidal.library.book.Book;
import com.vidal.library.book.BookService;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class BookController {

    private BookService service;

    @PostMapping()
    public Book save(@RequestBody Book book) {
        return service.save(book);
    }

    @PutMapping("")
    public Book update(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping()
    public List<Book> list() {
        return service.list();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        service.deleteById(id);
    }
}
