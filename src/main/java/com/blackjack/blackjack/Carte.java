/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

/**
 *
 * @author user
 */
public class Carte {
    private Valeur valeur;
    private Types type;
    
        public Carte (Valeur valeur , Types type){
            this.valeur=valeur;
            this.type=type;
        }

        public void setValeur(Valeur valeur) {
            this.valeur = valeur;
        }

        public Valeur getValeur() {
            return valeur;
        }
    
    @Override
        public String toString(){
           return "["+this.valeur.toString()+"|"+this.type.toString()+"]";
        }
            
}
