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
     ACE ("A", 11),
     JACK ("J", 10);
     
     
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
