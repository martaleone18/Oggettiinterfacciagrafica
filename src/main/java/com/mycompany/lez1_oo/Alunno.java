/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez1_oo;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Alunno {

    private String cognome;
    private String nome;
    private int votoFinale;
    private Esame esameAmmissione;
    private Esame elencoEsami[];
    private LocalDateTime datanascita;
    private String segnoZodiacale;
    //costruttore metodo con stesso nome classe

    /*getlibretto ritorna esami
    stile esempio 3 esami
    Esami fatti:
    database 50
    java 100
    html 88
    */
    public String getLibretto(){
        //scorro tutti gli esami fatti ( finche non trovo null)
        //e li aggiungo al testo da mandare indietro
        // alla fine ritorno il foglietto con l'elenco testuale
        String ris="";
        ris="Esami fatti :\n";//prima riga fissa
        for (int i = 0; i < elencoEsami.length; i++) {
            //se l'iesimo elemento e' null esco 
            //atrlimenti mi segno nome e voto
            if (elencoEsami[i] != null) {
                //aseggno esame
                ris+= (i+1) + " - " +elencoEsami[i].getNomeEsame() + " " 
                        + elencoEsami[i].getVotoEsame() + "\n";
                
            }
            else { //esco dal ciclo perche' esame null
                break;
            }
        }
        return ris;
    }
    //aggiunge esame a libretto
    public void addEsame(Esame newEsame) {
        for (int i = 0; i < elencoEsami.length; i++) {
            //se l'iesimo elemento e' null lo uso e 
            //gli assegno l'esame e poi me ne vado
            if (elencoEsami[i] == null) {
                //aseggno esame
                elencoEsami[i] = newEsame;
                //esco dal ciclo se no riempio tutto con lo stesso esame
                break;
            }
        }

    }

    public Esame[] getElencoEsami() {
        return elencoEsami;
    }

    public void setElencoEsami(Esame[] elencoEsami) {
        this.elencoEsami = elencoEsami;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getVotoFinale() {
        return votoFinale;
    }

    public String getSegnoZodiacale() {
        return segnoZodiacale;
    }

    public LocalDateTime getDatanascita() {
        return datanascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVotoFinale(int votoFinale) {
        this.votoFinale = votoFinale;
    }

    public Esame getEsameAmmissione() {
        return esameAmmissione;
    }

    public void setEsameAmmissione(Esame esameAmmissione) {
        this.esameAmmissione = esameAmmissione;
    }

    /**
     * costruttore Alunno con parametri datanascita automatica
     *
     * @param cognome inserire cognome alunno max 50 caratteri
     * @param nome inserire nome alunno max 50 caratteri
     *
     */
    public Alunno(String cognome, String nome, int numeroEsami) {
        this.cognome = cognome;
        this.nome = nome;
        elencoEsami = new Esame[numeroEsami];
        datanascita = LocalDateTime.now();

    }

    public Alunno(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
        datanascita = LocalDateTime.now();

    }

    public Alunno(String cognome) {
        //sistemo il cognome
        String okcognome;
        if (cognome.length() > 50) // taglialo
        {
            okcognome = cognome.substring(0, 50);
        } else {
            okcognome = cognome;
        }
        okcognome = okcognome.toUpperCase();
        //cognome apposto
        this.cognome = okcognome;
        nome = "";
        datanascita = LocalDateTime.now();
        int anno = datanascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "Drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "Topo";
        }

    }

    public String getPresentazione() {
        String frase;
        frase = "Mi chiamo " + cognome + " " + nome;
        //sistemo la data 
        DateTimeFormatter myFormatIt
                = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataOkIt = datanascita.format(myFormatIt);

        frase += " e sono nato il " + dataOkIt;

        return frase;
    }

}
