package com.example.bmpsapi.models;

import com.example.bmpsapi.entities.Auteur;

public class AuteurDTO {

    public Long id;

    public String auteurName;

    public String geboorteDatum;

    public String biografie;

    public AuteurDTO(Long pId,String pAuteurName, String pGeboorteDatum, String pBiografie) {
        this.id = pId;
        this.auteurName = pAuteurName;
        this.geboorteDatum = pGeboorteDatum;
        this.biografie = pBiografie;
    }

    public AuteurDTO(Auteur entity) {
        this.id = entity.getId();
        this.auteurName = entity.getAuteurName();
        this.geboorteDatum = entity.getGeboorteDatum();
        this.biografie = entity.getBiografie();
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

    public String getAuteurName() {
        return auteurName;
    }

    public void setAuteurName(String auteurName) {
        this.auteurName = auteurName;
    }
}
