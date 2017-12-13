/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.morpion;
import java.util.*; 

/**
 *
 * @author nicolashamelin
 */
public class Affichage 
{
    String team1 = "Croix";
    String team2 = "Rond";
    
    private static char joueur1 = 'X';
    private static char joueur2 = 'O';
    private static int coupsJoues = 0;
    
    private static Scanner scan = new Scanner(System.in);
    private static int x;
    private static int y;
            
    // CONSTRUCTEUR
    
    public Affichage(){
        
    }
    
    // METHODES
    
    public void chooseTeam()
    {
        
    }
    
    public void show()
    {
        
    }
    
    public static char[][] playIn()
    {
        System.out.println("Quelle case voulez-vous jouer ?");
        System.out.println("Sur l'axe x : ");
        x = Integer.parseInt(scan.next());
        System.out.println("Sur l'axe y : ");
        y = Integer.parseInt(scan.next());
        
        if (Partie.isValid(x, y) == true){
            if (Partie.joueurActif == 1)
                Plateau.grille[x][y] = joueur1;
            else
                Plateau.grille[x][y] = joueur2;
            coupsJoues++;
        }
        else {
            System.out.println("Vous ne pouvez pas jouer dans cette case");
        }
        
        return Plateau.grille;
    }
}
