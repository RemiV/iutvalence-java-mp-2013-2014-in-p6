package fr.iutvalence.java.mp.potavscapy;

import javax.swing.JButton;

/**
 * Create a main class for set the game.
 * @author vivierr
 *
 */
public class Main
{
    // TODO (fix) write comment
    
    public static void main(String[] args)
    {
        System.out.println("Bienvenue ! Veuillez choisir la taille de la carte de jeu :");
        new Game(sizemap).play();   
        
    }

}
