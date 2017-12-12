/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.morpion;

/**
 *
 * @author nicolashamelin
 */
public class Plateau 
{
    // ATTRIBUTS
    
    public static char[][] grille = new char [3][3];
    
    // CONSTRUCTOR
    
    public Plateau(){
        for (int i = 0; i < Plateau.grille.length; i++){
            System.out.println();
            for (int j = 0; j < Plateau.grille.length; j++){
                System.out.print(" | ");
            }
            System.out.print(" | ");
        }
    }
    
    
    // METHODES
    
    public void whatIsIn(int x, int y)
    {
        
      
    }
}
