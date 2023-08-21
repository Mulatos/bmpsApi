package com.example.bmpsapi.services;

import com.example.bmpsapi.entities.Book;
import com.example.bmpsapi.models.BookDTO;
import com.example.bmpsapi.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookDTO addBook(BookDTO dto) {
        try {
           bookRepository.save(new Book(dto));
           return dto;
        } catch (Exception exception) {
            System.out.println("creatie van een boek is niet gelukt.");
            throw exception;
        }
    }

    public BookDTO updateBook(BookDTO dto) {
        try {
            bookRepository.save(new Book(dto));
            return dto;
        } catch (Exception exception) {
            System.out.println("Geen update mogelijk.");
            throw exception;
        }
    }

    public Book deleteBook(Book dto) {
        try {
            bookRepository.delete(dto);
            return dto;
        } catch (Exception exception) {
            System.out.println("Het boek is niet verwijderd.");
            throw exception;
        }
    }

    public Book findBookById(Long id) {
        try {
            Book book = bookRepository.findById(id).orElseThrow();
            return book;
        } catch (Exception exception) {
            System.out.println("Geen entiteit kunnen vinden met dit id");
            throw  exception;
        }
    }

    public List<Book> getAllBooks() {
        try {
            List<Book> books = bookRepository.findAll();
            return books;
        } catch (Exception exception) {
            System.out.println("Niet alle boeken kunnen weergeven");
            throw exception;
        }
    }

    public List<Book> getBooksByIsbn(String isbn) {
        List<Book> booksByIsbn = new ArrayList<>();
        for (Book book: getAllBooks()) {
            if (book.getIsbn().contains(isbn)) {
                booksByIsbn.add(book);
            }
        }
        return booksByIsbn;
    }
}
