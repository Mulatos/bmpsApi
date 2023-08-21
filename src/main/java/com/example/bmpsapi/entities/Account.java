package com.example.bmpsapi.entities;

import com.example.bmpsapi.models.AccountDTO;
import javax.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name= "adres", nullable = false)
    private String adres;

    @Column(name = "contactinformatie", nullable = false)
    private String contactInformatie;

    public Account(){

    }

    public Account(AccountDTO dto) {
        this.name = dto.getName();
        this.adres = dto.getAdres();
        this.contactInformatie = dto.getContactInformatie();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getContactInformatie() {
        return contactInformatie;
    }

    public void setContactInformatie(String contactInformatie) {
        this.contactInformatie = contactInformatie;
    }
}
