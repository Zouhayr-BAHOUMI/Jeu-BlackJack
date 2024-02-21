/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public interface CroupierInterface {
    
    void  distribuerCartes(Joueur joueur, PaquetCartes paquet);
    void  releverCarteCashe();
    void  tirerCarte(PaquetCartes paquet);
    void  comparerMains(Joueur joueur);
    void  voirCartes();
    
}
