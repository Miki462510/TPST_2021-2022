package com.example;

public class Root {
    private int annoDiInizio;
    private Aula aula;
    private int numeroFinestre;
    private String specializzazione;
    private Studente studenti[];

    // costruttore
    public Root(int annoDiInizio, Aula aula, int numeroFinestre, String specializzazione, Studente[] studenti) {
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
        this.studenti = studenti;
    }

    // costruttore senza oggetti
    public Root(int annoDiInizio, Aula aula, int numeroFinestre, String specializzazione) {
        this.annoDiInizio = annoDiInizio;
        this.aula = aula;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
    }

    // costruttore senza oggetti e aula
    public Root(int annoDiInizio, int numeroFinestre, String specializzazione) {
        this.annoDiInizio = annoDiInizio;
        this.numeroFinestre = numeroFinestre;
        this.specializzazione = specializzazione;
    }

    public Root() {

    }

    public int getAnnoDiInizio() {
        return annoDiInizio;
    }

    public Aula getAula() {
        return aula;
    }

    public int getNumeroFinestre() {
        return numeroFinestre;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

}
