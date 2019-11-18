/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez1_oo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author tss
 */
public class MainStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Alunno a1 = new Alunno("rossi", "mario", 6);
        
        Esame esammissione = new Esame("ammisione corso tss", 100);
        a1.setEsameAmmissione(esammissione);
        Esame esameSTD;
        esameSTD= new Esame("tecniche programmazione", 85);
        //vecchio sistema aggiunta esameSTD
        Esame el_esamialunno[];
        el_esamialunno = a1.getElencoEsami();
        el_esamialunno[0] = esameSTD;
        //preparo altro voto esame
        esameSTD = new Esame("database", 100);
        //nuovo sistema aggiunta esame
        a1.addEsame(esameSTD);
        //visualizzo libretto di a1
        System.out.println(a1.getLibretto());
        
        
        
        int voto = a1.getEsameAmmissione().getVotoEsame();
        String esame = a1.getEsameAmmissione().getNomeEsame();
        System.out.println(esame + " voto " + voto + " alunno " + a1.getCognome()
                + " " + " " + a1.getElencoEsami()[0].getVotoEsame()
                + " " + a1.getElencoEsami()[0].getNomeEsame());

        long milsec = 4000;
        Thread.sleep(milsec);
        Alunno a2 = new Alunno("guerrini", "luca");
        System.out.println(a1.getPresentazione());
        System.out.println(a2.getPresentazione());

        if (a1.getVotoFinale() > a2.getVotoFinale()) {
            System.out.println("bravo " + a1.getCognome() + " " + a1.getNome());
        } else {
            System.out.println("bravo " + a2.getCognome() + " " + a2.getNome());
        }
    }

}
