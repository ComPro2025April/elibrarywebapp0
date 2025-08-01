package edu.miu.cs.cs425.lesson_z.elibrarywebapp0.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table(name = "books")
public class Book {
    @Id
    private Long bookId;
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private Double price;
    private LocalDate datePublished;

    public Book(Long bookId, String title, String isbn, String author, String publisher, Double price, LocalDate datePublished) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.datePublished = datePublished;
    }

    public Book() {
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", datePublished=" + datePublished +
                '}';
    }
}
