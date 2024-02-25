/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main implements MainInterface {
       
        private List<Carte> cartes;
        private int valeurTotal;
        private int nbCartes;
    
        public Main(){
          this.cartes = new ArrayList<>();
          this.nbCartes=0;
        }

        @Override
        public void ajouterCarte(Carte carte){
            cartes.add(carte);
            this.nbCartes++;
        }

        @Override
        public int calculerValeurMain(){
            int nombreAs=0;
            valeurTotal = 0;
            for (Carte carte : cartes){
                valeurTotal+=carte.getValeur();
                if (carte.getValeur()== 11){
                  nombreAs ++;
                }
            }

            while (valeurTotal > 21 && nombreAs > 0 ){
                 valeurTotal-=10;
                 nombreAs--;
            }

            return valeurTotal;
        }

    private void misAjourMainValuer(Connection connection) {

        String query = "UPDATE Main SET valeurTotal = ? WHERE id_Main = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, valeurTotal);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("valeurTotal not updating"+ e.getMessage());
        }
    }

        public List<Carte> getCartes() {
            return cartes;
        }

        public int getValeurTotal() {
            return valeurTotal;
        }

        
        
        
        
        
        
        
        
    
    
}
