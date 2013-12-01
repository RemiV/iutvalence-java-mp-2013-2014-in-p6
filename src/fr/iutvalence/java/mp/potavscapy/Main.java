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
       
        // TODO (fix) remove this, no GUI for the moment
        JButton btnTuto = new JButton("Tuto");
        JButton btnMedium = new JButton("Normal");
        JButton btnHuge = new JButton("Difficile");
        
        
        new Game(sizemap).play();   
        
    }

}
