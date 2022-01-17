package com.example.voltify;

import java.util.ArrayList;

public class Gestorebrani {
    ArrayList<Brano> listaBrani;
    public Gestorebrani(){ //costruttore gestorebrani
        listaBrani= new ArrayList<Brano>(); //istanzia l'arraylist
    }

    public void addBrano(String titolo, int durata, String autore, String genere){

        Brano br= new Brano(titolo, durata, autore, genere);
        listaBrani.add(br); //aggiungo all'arraylist il brano

    }

    public void visualizzaBrani(){

    }
}
