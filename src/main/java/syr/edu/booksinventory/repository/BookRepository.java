package syr.edu.booksinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import syr.edu.booksinventory.model.Book;

// This interface will be AUTO IMPLEMENTED by Spring into a Bean called bookRepository
public interface BookRepository extends JpaRepository<Book, Long> {
}


