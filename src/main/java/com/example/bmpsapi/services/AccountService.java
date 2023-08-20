package com.example.bmpsapi.services;

import com.example.bmpsapi.entities.Account;
import com.example.bmpsapi.entities.Auteur;
import com.example.bmpsapi.models.AccountDTO;
import com.example.bmpsapi.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountDTO addAccount(AccountDTO dto) {
        try {
            accountRepository.save(new Account(dto));
            return dto;
        } catch (Exception exception) {
            System.out.println("Creatie van het account is niet gelukt.");
            throw exception;
        }
    }
}
