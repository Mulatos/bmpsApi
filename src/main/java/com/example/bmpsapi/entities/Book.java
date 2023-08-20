package com.example.bmpsapi.entities;

import com.example.bmpsapi.models.BookDTO;
import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Long id;

    @Column(name = "auteur", nullable = false)
    private String auteur;

    @Column(name = "titel", nullable = false)
    private String titel;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "beschrijving", nullable = false)
    private String beschrijving;

    @Column(name = "uitgever", nullable = false)
    private String uitgever;

    public Book() {

    }

    public Book(BookDTO dto) {
        this.auteur = dto.getAuteur();
        this.titel = dto.getTitel();
        this.isbn = dto.getIsbn();
        this.beschrijving = dto.getBeschrijving();
        this.uitgever = dto.getUitgever();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        this.uitgever = uitgever;
    }
}
