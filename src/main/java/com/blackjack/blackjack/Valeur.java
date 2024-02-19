/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public enum Valeur {
        
        ACE ("ace", 11),
        JACK ("jack", 10),
        QUEEN ("queen", 10),
        KING ("king", 10),
        DEUX ("deux", 2),
        TROIS ("trois", 3),
        QUATRE ("quatre", 4),
        CINQ ("cinq", 5),
        SIX ("six", 6),
        SEPT ("sept", 7),
        HUIT ("huit", 8),
        NEUF ("neuf", 9),
        DIX ("dix", 10);
     
     
     private final String nom;  
     private  int valeur;
     
     private Valeur (String nom, int valeur){
       this.nom=nom;
       this.valeur=valeur;
     }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
     
     
}
