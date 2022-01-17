package com.example.voltify;

public class Brano {

    private String titolo;
    private int durata;
    private String autore;
    private String genere;

    public Brano(String titolo, int durata, String autore, String genere){ //costruttore brano

        this.titolo= titolo;
        this.durata= durata;
        this.autore= autore;
        this.genere= genere;

    }

    //getter e setter

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
