/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.blackjack.blackjack;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BlackJack {

    private PaquetCartes paquet;
    private Joueur joueur;
    private Croupier croupier;
    
        public BlackJack(String username, double solde, int valeurTotalLimit){
            this.paquet= new PaquetCartes ();
            this.paquet.remplirPaquetCartes(DbConnection.getConnection());
            this.paquet.melanger();
            
            this.joueur = new Joueur (username,solde);
            this.croupier = new Croupier(valeurTotalLimit);
        } 
        
        public void jouerPartie(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donner votre mise sir !");
                double mise = scanner.nextDouble();
                joueur.placerMise(DbConnection.getConnection(),mise);
                if (mise > joueur.getSolde()) {
                    System.out.println("Solde insuffisant.");
                    return;
                }
                croupier.distribuerCartes(joueur, paquet);
                
            System.out.println();
            
            System.out.println("Le jeu va commencer , bon courage °-° ");
                
                croupier.voirCartes();
                joueur.voirCartes();
                
            while(true){
                System.out.println("1- Hit (ajouter une carte)");
                System.out.println("2- Stand (Arrêter)");
                System.out.println("Entrez votre choix : ");
                int choix = scanner.nextInt();
                
                if (choix == 1){
                    joueur.tirerCarte(paquet);
                    joueur.voirCartes();
                    
                   if (joueur.getMain().calculerValeurMain() > 21 ){
                        joueur.consulterResultat("loose");
                        joueur.setSolde(joueur.getSolde()- mise);
                       joueur.placerMise(DbConnection.getConnection(), -mise);
                        return;
                   }
                       
                }else if( choix == 2){
                    break;
                }else
                    System.out.println("invalid choix");
            }
            
            croupier.releverCarteCashe();
            croupier.voirCartes();
            
            while (croupier.getMain().calculerValeurMain() < 17){
                croupier.tirerCarte(paquet);
                croupier.voirCartes();
            }
            
            croupier.comparerMains(joueur);
            
           
        }

        
    public static void main(String[] args) {
       /* PaquetCartes paquet = new PaquetCartes();
        paquet.remplirPaquetCartes();
        paquet.melanger();
        
        System.out.println("la taille du paquet est "+ paquet.getSize());
        
        Carte cartetirer = paquet.tirerCarte();
        if (cartetirer!= null)
            System.out.println("la carte tire est "+ cartetirer);
        
        System.out.println("la taille nouveau de paquet est  "+ paquet.getSize());*/
       Connection connection = DbConnection.getConnection();
       
       Scanner scanner = new Scanner(System.in);
        int choix;

        while(true){
            BlackJack jeu = new BlackJack("Amine",400,17);
            System.out.println("================  You are in the game  ================");
            System.out.println();
            System.out.println("Bonjour, "+jeu.joueur.getUsername()+" Ready? -_- !");
            System.out.println();
            System.out.println("-- Pablo Table --");
            System.out.println("1- Commencer à jouer");
            System.out.println("2- je le consulter mon solde  ");
            System.out.println();
            System.out.println("Entrez votre choix : ");

            if (scanner.hasNextInt()){
                choix = scanner.nextInt();
                switch (choix) {

                    case 1:
                        
                        jeu.jouerPartie();
                        break;
                    case 2:
                        System.out.println("-> Votre solde de jetons est de : "+jeu.joueur.getSolde()+" pièces");
                        break;
                    default:
                        System.out.println("Choix invalide.");
                        break;
                }
            }else{
                   System.out.println("entrer une nombre.");
                   scanner.next();
            }
        }
        
        
    }
}
