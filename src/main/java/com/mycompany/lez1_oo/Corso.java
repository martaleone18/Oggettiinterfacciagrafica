/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez1_oo;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Corso {
    private String nomeCorso;
    private int numOre;
    private String edizione;
    private ArrayList<Alunno> registro;

    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
        registro= new ArrayList<Alunno>();
        numOre=0;
        edizione="---";
    }
    
    public String getRowCorso(){
        String ris="";
        ris= nomeCorso + " - ed. " + edizione + " - " +numOre + "H\n";
        return ris;
    }

    
    
    
    
    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public int getNumOre() {
        return numOre;
    }

    public void setNumOre(int numOre) {
        this.numOre = numOre;
    }

    public String getEdizione() {
        return edizione;
    }

    public void setEdizione(String edizione) {
        this.edizione = edizione;
    }

    public ArrayList<Alunno> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Alunno> registro) {
        this.registro = registro;
    }
    
    
    
    
    
}
