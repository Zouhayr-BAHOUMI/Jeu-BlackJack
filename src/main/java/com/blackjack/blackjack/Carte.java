/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Carte implements CarteInterface {
    private String type;
    private int  valeur;
    private String valeurnom;
    
        public Carte (String type , int  valeur, String valeurnom){
            this.type=type;
            this.valeur=valeur;
            this.valeurnom=valeurnom;
        }

    public int getValeur() {
        return valeur;
    }

    public String getType() {
        return type;
    }

    public String getValeurnom() {
        return valeurnom;
    }

    public void createCarte(Connection connection){
        String query = "INSERT INTO Carte (type, valeur, valeurnom) VALUES (?, ?, ?)";
        try{

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, type);
            statement.setInt(2, valeur);
            statement.setString(3, valeurnom);
            statement.executeUpdate();
            System.out.println("Carte insérée avec succès ");

        }catch(SQLException e){
            System.out.println("Erreur lors de l'insertion de la carte");
        }
    }

    @Override
        public String toString(){
           return "["+valeurnom +"|"+type+"] ==> "+valeur;
        }
            
}
