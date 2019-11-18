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
public class Esame {
    private String nomeEsame;
    private int votoEsame;
    private String docenteEsame;
    private LocalDateTime dataEsame;

    public Esame(String nomeEsame, int votoEsame) {
        this.nomeEsame = nomeEsame;
        this.votoEsame = votoEsame;
        dataEsame= LocalDateTime.now();
    }

    public String getNomeEsame() {
        return nomeEsame;
    }

    public void setNomeEsame(String nomeEsame) {
        this.nomeEsame = nomeEsame;
    }

    public int getVotoEsame() {
        return votoEsame;
    }

    public void setVotoEsame(int votoEsame) {
        this.votoEsame = votoEsame;
    }

    public String getDocenteEsame() {
        return docenteEsame;
    }

    public void setDocenteEsame(String docenteEsame) {
        this.docenteEsame = docenteEsame;
    }

    public LocalDateTime getDataEsame() {
        return dataEsame;
    }

    
    
    
    
}
