/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public class BlackJack {

    public static void main(String[] args) {
        PaquetCartes paquet = new PaquetCartes();
        paquet.remplirPaquetCartes();
        paquet.melanger();
        
        System.out.println("la taille du paquet est "+ paquet.getSize());
        
        Carte cartetirer = paquet.tirerCarte();
        if (cartetirer!= null)
            System.out.println("la carte tire est "+ cartetirer);
        
        System.out.println("la taille nouveau de paquet est  "+ paquet.getSize());
    }
}
