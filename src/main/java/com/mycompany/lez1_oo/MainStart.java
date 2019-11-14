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
        Alunno  a1 = new Alunno("rossi","mario",100);
        
        long milsec=4000;
        Thread.sleep(milsec);
        Alunno a2 = new Alunno("guerrini","luca");
        System.out.println(a1.getPresentazione());
        System.out.println(a2.getPresentazione());
        if (a1.getVoto() > a2.getVoto()) {
            System.out.println("bravo " + a1.getCognome() + " " + a1.getNome());
        } else {
            System.out.println("bravo " + a2.getCognome() + " " + a2.getNome());
        }
    }

}
