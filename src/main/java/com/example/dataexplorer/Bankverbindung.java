package com.example.dataexplorer;

public class Bankverbindung {
    private Long id;
    private String iban;
    private String bankname;
    private String bankleitzahl;
    private String bic;
    private String kontonummer;
    private String land;

    // Getter methods
    public Long getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public String getBankname() {
        return bankname;
    }

    public String getBankleitzahl() {
        return bankleitzahl;
    }

    public String getBic() {
        return bic;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public String getLand() {
        return land;
    }

    // Setter methods
    public void setId(Long id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setBankleitzahl(String bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public void setLand(String land) {
        this.land = land;
    }
}


