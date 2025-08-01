package edu.miu.cs.cs425.lesson_z.elibrarywebapp0.service;

import edu.miu.cs.cs425.lesson_z.elibrarywebapp0.model.Book;
import edu.miu.cs.cs425.lesson_z.elibrarywebapp0.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        books.sort(Comparator.comparing(Book::getTitle));
        return books;
    }

}
