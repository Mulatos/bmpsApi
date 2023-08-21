package com.example.bmpsapi.controllers;

import com.example.bmpsapi.entities.Book;
import com.example.bmpsapi.models.BookDTO;
import com.example.bmpsapi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<BookDTO> addNewBook(@RequestBody BookDTO dto) {
        try {
            System.out.println(dto);
            BookDTO bookDTO = bookService.addBook(dto);
            return new ResponseEntity<>(bookDTO, HttpStatus.CREATED);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<BookDTO> updateBook(@RequestBody BookDTO dto, @PathVariable(name = "id") Long id)  {
        try {
            System.out.println(dto);
            BookDTO bookDTO = bookService.updateBook(dto);
            bookService.findBookById(id);
            return new ResponseEntity<>(bookDTO, HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable(name = "id") Long id, @RequestBody Book dto) {
//        try {
//            Book book = bookService.findBookById(id);
//            return new ResponseEntity<>(book, HttpStatus.OK);
//        } catch (EntityNotFoundException entityNotFoundException) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }

        try {
            Book book = bookService.deleteBook(dto);
            bookService.findBookById(id);
            return new ResponseEntity<>(book, HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
