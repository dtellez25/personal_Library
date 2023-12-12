package edu.trinity.personal_library.services;

import edu.trinity.personal_library.dao.bookRepository;
import edu.trinity.personal_library.entities.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class bookService {
    private final bookRepository bookRepository;

    public bookService(bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void initializeDatabase() {
        // Don't need this (initialization in src/main/resources/data.sql)
    }

    @Transactional(readOnly = true)
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Book> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    public void deleteAllBooks() {
        bookRepository.deleteAllInBatch();
    }

    @Transactional(readOnly = true)
    public List<Book> findBooksPublishedAfter(LocalDate date) {
        return bookRepository.findByPublicationDateAfter(date);
    }

    @Transactional(readOnly = true)
    public long countBooks() {
        return bookRepository.count();
    }
}
