package com.vidal.library.book.persistence;

import com.vidal.library.book.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;

    public static Book toDomain(BookEntity bookEntity) {
        return Book.builder()
                   .id(bookEntity.getId())
                   .title(bookEntity.getTitle())
                   .description(bookEntity.getDescription())
                   .price(bookEntity.getPrice())
                   .build();
    }

    public static BookEntity from(Book book) {
        return BookEntity.builder()
                         .id(book.getId())
                         .title(book.getTitle())
                         .description(book.getDescription())
                         .price(book.getPrice())
                         .build();
    }
}
