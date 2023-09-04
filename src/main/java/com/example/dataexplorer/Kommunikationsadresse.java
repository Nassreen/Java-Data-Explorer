package com.example.dataexplorer;

public class Kommunikationsadresse {
    private Long id;
    private String email;
    private String telefon;

    // Getter methods
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }


    // Setter methods
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}



