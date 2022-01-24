package com.example;

public class Aula {
    private String nome;
    private int numeroDiBanchi;

    // costruttore
    public Aula(String nome, int numeroDiBanchi) {
        this.nome = nome;
        this.numeroDiBanchi = numeroDiBanchi;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDiBanchi() {
        return numeroDiBanchi;
    }

}
