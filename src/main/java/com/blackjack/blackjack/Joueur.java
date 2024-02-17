/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public class Joueur {
    private String username;
    private double solde;
    
    public Joueur(String username, double solde){
        super();
        this.username = username;
        this.solde = solde;
    }
    
    public void placerMise(double valeurMiser){
       solde -= valeurMiser;
    }
    
}
