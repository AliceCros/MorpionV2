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
public class Partie
{
    public static void main (String[] args)
    {
        
        Plateau grille = new Plateau();
        
        System.out.println(grille);
    
        System.out.println("content : " + Plateau.getContent());

        
    }
    
        public void changePlayer()
        {

        }

        public void getState()
        {

        }

        public boolean isValid(int x, int y)
        {
            char valid = Plateau.whatIsIn(x, y);
            
            if (valid == ' '){
                return true;
            }
            else {
                return false;
            }
        }
        
}