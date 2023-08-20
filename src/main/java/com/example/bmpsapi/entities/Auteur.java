package com.example.bmpsapi.entities;

import com.example.bmpsapi.models.AuteurDTO;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auteur_id", nullable = false)
    private Long id;

    @Column(name = "geboortedatum", nullable = false)
    private String geboorteDatum;

    @Column(name = "biografie")
    private String biografie;

    @ManyToMany
    @JoinTable(
            name = "auteur_book",
            joinColumns = @JoinColumn(name = "auteur_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Auteur> auteurs = new HashSet<>();

    public Auteur(){

    }

    public Auteur(AuteurDTO dto) {
        this.geboorteDatum = dto.getGeboorteDatum();
        this.biografie = dto.getBiografie();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getBiografie() {
        return biografie;
    }

    public void setBiografie(String biografie) {
        this.biografie = biografie;
    }
}
