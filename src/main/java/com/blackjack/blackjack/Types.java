/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public enum Types {
    
    COEUR("coeur"),
    PIQUE("pique"),
    CARREAU("carreau"),
    TREFLE("trefle");
    
    private final String nom;
    
    private Types (String nom){
       this.nom=nom;
    }

    public String getNom() {
        return nom;
    }
    
    
}
