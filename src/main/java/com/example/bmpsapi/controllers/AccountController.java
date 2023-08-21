package com.example.bmpsapi.controllers;

import com.example.bmpsapi.models.AccountDTO;
import com.example.bmpsapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<AccountDTO> addNewAccount(@RequestBody AccountDTO dto) {
        try {
            System.out.println(dto);
            AccountDTO accountDTO = accountService.addAccount(dto);
            return new ResponseEntity<>(accountDTO, HttpStatus.CREATED);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
