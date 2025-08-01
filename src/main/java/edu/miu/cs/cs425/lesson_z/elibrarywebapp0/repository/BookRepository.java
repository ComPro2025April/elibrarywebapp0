package edu.miu.cs.cs425.lesson_z.elibrarywebapp0.repository;

import edu.miu.cs.cs425.lesson_z.elibrarywebapp0.model.Book;
import org.springframework.data.repository.ListCrudRepository;

public interface BookRepository extends ListCrudRepository<Book, Long> {
}
