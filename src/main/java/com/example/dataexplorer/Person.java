package com.example.dataexplorer;

import java.util.List;

public class Person {
    private Long id;
    private String vorname;
    private String nachname;
    private String geschlecht;
    private List<Anschrift> anschriften;
    private List<Kommunikationsadresse> kommunikationsadressen;
    private List<Bankverbindung> bankverbindungen;

    // Getter methods
    public Long getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public List<Anschrift> getAnschriften() {
        return anschriften;
    }

    public List<Kommunikationsadresse> getKommunikationsadressen() {
        return kommunikationsadressen;
    }

    public List<Bankverbindung> getBankverbindungen() {
        return bankverbindungen;
    }

    // Setter methods
    public void setId(Long id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setAnschriften(List<Anschrift> anschriften) {
        this.anschriften = anschriften;
    }

    public void setKommunikationsadressen(List<Kommunikationsadresse> kommunikationsadressen) {
        this.kommunikationsadressen = kommunikationsadressen;
    }

    public void setBankverbindungen(List<Bankverbindung> bankverbindungen) {
        this.bankverbindungen = bankverbindungen;
    }
}

