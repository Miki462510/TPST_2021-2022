package com.example;

public class Studente {
    private int annoDiNascita;
    private String nomeStudente;
    private String cognomeStudente;

    // costruttore
    public Studente(int annoDiNascita, String nomeStudente, String cognomeStudente) {
        this.annoDiNascita = annoDiNascita;
        this.nomeStudente = nomeStudente;
        this.cognomeStudente = cognomeStudente;
    }

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public String getNomeStudente() {
        return nomeStudente;
    }

    public String getCognomeStudente() {
        return cognomeStudente;
    }
}
