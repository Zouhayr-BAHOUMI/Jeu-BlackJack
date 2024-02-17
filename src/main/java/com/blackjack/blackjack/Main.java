/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {
       
        private List<Carte> cartes;
        private int valeurTotal;
        private int nbCartes;
    
        public Main(){
          this.cartes = new ArrayList<>();
          this.nbCartes=0;
        }

        public void ajouterCarte(Carte carte){
            cartes.add(carte);
            this.nbCartes++;
        }

        public int calculerValeurMain(){
            int nombreAs=0;
            valeurTotal = 0;
            for (Carte carte : cartes){
                valeurTotal+=carte.getValeur().getValeur();
                if (carte.getValeur()== Valeur.ACE){
                  nombreAs ++;
                }
            }

            while (valeurTotal > 21 && nombreAs > 0 ){
                 valeurTotal-=10;
                 nombreAs--;
            }

            return valeurTotal;
        }

        public int getNbCartes() {
            return nbCartes;
        }
    
    
}
