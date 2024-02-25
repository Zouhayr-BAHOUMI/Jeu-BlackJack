/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blackjack.blackjack;

import java.sql.Connection;

/**
 *
 * @author user
 */
public interface PaquetCartesInterface {
    void remplirPaquetCartes(Connection connection);
    void melanger();
    Carte tirerCarte();
}
