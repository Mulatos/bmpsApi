package com.example.bmpsapi.models;

import com.example.bmpsapi.entities.Book;

public class BookDTO {

    public Long id;

    public String auteur;

    public String titel;

    public String isbn;

    public String beschrijving;

    public String uitgever;

    public BookDTO(Long pId, String pAuteur, String pTitel, String pIsbn, String pBeschrijving, String pUitgever) {
        this.id = pId;
        this.auteur = pAuteur;
        this.titel = pTitel;
        this.isbn = pIsbn;
        this.beschrijving = pBeschrijving;
        this.uitgever = pUitgever;
    }

    public BookDTO(Book entity) {
        this.id = entity.getId();
        this.auteur = entity.getAuteur();
        this.titel = entity.getTitel();;
        this.isbn = entity.getIsbn();
        this.beschrijving = entity.getBeschrijving();
        this.uitgever = entity.getUitgever();
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
