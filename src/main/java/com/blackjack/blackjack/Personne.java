/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.blackjack;

import java.sql.Connection;

/**
 *
 * @author user
 */
abstract public class Personne {
    protected Main main;
    
    public Personne(){
      this.main=new Main();
    }

    public Main getMain() {
        return main;
    }
    

    abstract public void  tirerCarte(PaquetCartes paquet);
    abstract public void  voirCartes();
}
