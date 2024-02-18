/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public class Croupier extends Personne{
    
        private int valeurTotalLimit;
        private boolean carteCasheeRelevee;
        
        
        public Croupier(int valeurTotalLimit){
            super();
            this.valeurTotalLimit=valeurTotalLimit;
        }
        
        public void distribuerCartes(Joueur joueur, PaquetCartes paquet){
           joueur.recevoirCartes(paquet.tirerCarte(), paquet.tirerCarte());
           main.ajouterCarte(paquet.tirerCarte());
           main.ajouterCarte(paquet.tirerCarte());
        }
        
        public void releverCarteCashe(){
            main.calculerValeurMain();
            System.out.println("le croupier expose sa main cashé");
            carteCasheeRelevee = true;
        }
        
        @Override
        public void  tirerCarte(PaquetCartes paquet){
            while(main.calculerValeurMain()< valeurTotalLimit){
                Carte carteTirer = paquet.tirerCarte();
                if (carteTirer != null){
                    main.ajouterCarte(carteTirer);
                    System.out.println("<<< Le croupier est tire une carte. >>>");
                }else
                    System.out.println("<<< le paquet est vide.");
            }
        }
        
        public void comparerMains(Joueur joueur){
           
           int valeurMainJoueur = joueur.getMain().calculerValeurMain();
           int valeurMainCroupier = main.calculerValeurMain();
           
           if ( valeurMainCroupier>21 || (valeurMainJoueur <= 21 && valeurMainJoueur > valeurMainCroupier)){
                joueur.afficherResultat("win !!!");
           }else if (valeurMainJoueur == valeurMainCroupier){
                joueur.afficherResultat("ta3adol");
           }else
               joueur.afficherResultat("loooooose");
        }
        
        
        @Override
        public void voirCartes() {
        
        System.out.println("Croupier main : ");
            for (int i=0; i< main.getCartes().size(); i++){
                if (i == 1 && !carteCasheeRelevee)
                    System.out.println("Carte "+(i+1)+ " : cashee");
                else
                    System.out.println("Carte "+(i+1)+ ":" +main.getCartes().get(i).toString());
            }
            
        }

        public int getValeurTotalLimit() {
            return valeurTotalLimit;
        }
        
        
}
