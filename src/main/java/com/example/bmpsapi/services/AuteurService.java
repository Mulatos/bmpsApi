package com.example.bmpsapi.services;

import com.example.bmpsapi.entities.Auteur;
import com.example.bmpsapi.models.AuteurDTO;
import com.example.bmpsapi.repositories.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public AuteurDTO addAuteur(AuteurDTO dto) {
        try {
            auteurRepository.save(new Auteur(dto));
            return dto;
        } catch (Exception exception) {
            System.out.println("Auteur is niet aangemaakt.");
            throw exception;
        }
    }

    public AuteurDTO updateAuteur(AuteurDTO dto){
        try {
            auteurRepository.save(new Auteur(dto));
            return dto;
        } catch (Exception exception) {
            System.out.println("Deze auteur niet kunnen updaten.");
            throw exception;
        }
    }

    public Auteur deleteAuteur(Auteur auteur) {
        try {
            auteurRepository.delete(auteur);
            return auteur;
        } catch (Exception exception) {
            System.out.println("Er is een fout opgetreden.");
            throw exception;
        }
    }
}
