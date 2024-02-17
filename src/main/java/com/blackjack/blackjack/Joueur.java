/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public class Joueur extends Personne {
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
    
    public void recevoirCartes(Carte carte1, Carte carte2){
        main.ajouterCarte(carte1);
        main.ajouterCarte(carte2);
    } 
    
    public void rester() {
        System.out.println("Le joueur " + username + " est reste.");
    }
    
    @Override
    public void  tirerCarte(PaquetCartes paquet){
        Carte carteTirer = paquet.tirerCarte();
        if (carteTirer != null){
            main.ajouterCarte(carteTirer);
            System.out.println("<<< Le joueur " + username + " est tire une carte. >>>");
        }else
            System.out.println("<<< le paquet est vide.");
    }
    
    public void afficherResultat(String resultat){
            System.out.println("<<< Le joueur " + username + " est" + resultat);
    }
    
    @Override
    public void voirCartes() {
        
        System.out.println("Votre main : ");
        for (Carte carte : main.getCartes()) {
            System.out.println(carte);
        }
    }

    public double getSolde() {
        return solde;
    }
    
    
    
    
    
    
    
}
