/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.blackjack.blackjack;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BlackJack {

    public static void main(String[] args) {
       /* PaquetCartes paquet = new PaquetCartes();
        paquet.remplirPaquetCartes();
        paquet.melanger();
        
        System.out.println("la taille du paquet est "+ paquet.getSize());
        
        Carte cartetirer = paquet.tirerCarte();
        if (cartetirer!= null)
            System.out.println("la carte tire est "+ cartetirer);
        
        System.out.println("la taille nouveau de paquet est  "+ paquet.getSize());*/
       
        System.out.println("================  You are in the game  ================");
        System.out.println();
        System.out.println("Bonjour You, Ready? -_- !");
        System.out.println();
        System.out.println("-- Pablo Table --");
        System.out.println("1- Commencer à jouer");
        System.out.println("2- je le consulter mon solde  ");
        System.out.println();
        System.out.println("Entrez votre choix : ");
        
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

        switch (choix) {
        
            case 1:
                //BlackJack jeu = new BlackJack();
                // jeu.demarrerPartie();
                break;
            case 2:
                System.out.println("-> Votre solde de jetons est de : 200 pièces");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
