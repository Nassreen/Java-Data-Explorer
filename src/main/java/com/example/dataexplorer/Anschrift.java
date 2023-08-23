package com.example.dataexplorer;

public class Anschrift {
    private Long id;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;
    private String land;

    // Getter methods
    public Long getId() {
        return id;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getLand() {
        return land;
    }

    // Setter methods
    public void setId(Long id) {
        this.id = id;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setLand(String land) {
        this.land = land;
    }
}


