/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public interface JoueurInterface {
   
    void placerMise(double valeurMiser);
    void recevoirCartes(Carte carte1, Carte carte2);
    void rester();
    void tirerCarte(PaquetCartes paquet);
    void consulterResultat(String resultat);
    void voirCartes();
}
