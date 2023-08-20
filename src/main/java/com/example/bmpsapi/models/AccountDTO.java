package com.example.bmpsapi.models;

import com.example.bmpsapi.entities.Account;

public class AccountDTO {

    public Long id;

    public String name;

    public String adres;

    public String contactInformatie;

    public AccountDTO() {

    }

    public AccountDTO(Long pId,String pName, String pAdres, String pContactInformatie) {
        this.id = pId;
        this.name = pName;
        this.adres = pAdres;
        this.contactInformatie = pContactInformatie;
    }

    public AccountDTO(Account entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.adres = entity.getAdres();
        this.contactInformatie = entity.getContactInformatie();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
