/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class PaquetCartes implements PaquetCartesInterface{
       
        private List<Carte> cartes;
        private int size;
    
            public PaquetCartes(){
                this.cartes = new ArrayList<>();
                this.size=0;
            }
        
        @Override
        public void remplirPaquetCartes(Connection connection){
            try {
                String query = "SELECT type, valeur, valeurnom FROM Carte";
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultat = statement.executeQuery();
                while (resultat.next()) {
                    String type = resultat.getString("type");
                    int valeur = resultat.getInt("valeur");
                    String valeurnom = resultat.getString("valeurnom");
                    Carte carte = new Carte(type, valeur, valeurnom);
                    cartes.add(carte);
                    this.size++;
                }
                melanger();
            } catch (SQLException e) {
                System.out.println("while filling the deck with cards"+e.getMessage());
            }
        }

        @Override
        public void melanger(){
            Collections.shuffle(cartes);
        }

        public int getSize() {
            return size;
        }
        
        @Override
        public Carte tirerCarte(){
             if (cartes.isEmpty()){
               System.out.println("le paquet est vide ");
               return null;
             }
             
               Carte carteTire = cartes.remove(0);
               this.size--;
               return carteTire;
                 
        }


        
        
        
        
}
