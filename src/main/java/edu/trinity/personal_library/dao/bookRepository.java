package edu.trinity.personal_library.dao;

import edu.trinity.personal_library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface bookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublicationDateAfter(LocalDate date);
}
