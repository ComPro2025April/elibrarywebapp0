package edu.miu.cs.cs425.lesson_z.elibrarywebapp0.controller;

import edu.miu.cs.cs425.lesson_z.elibrarywebapp0.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"/elibrary/books"})
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = {""})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        var books = bookService.getAllBooks();
        modelAndView.addObject("books", books);
        modelAndView.addObject("librarianName", "Eric B. Schmidt");
        modelAndView.addObject("libraryLocation", "1006 North 4th Street");
        modelAndView.setViewName("ecatalog/book/list");
        return modelAndView;
    }
}
