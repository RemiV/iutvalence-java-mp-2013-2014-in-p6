package fr.iutvalence.java.mp.potavscapy;

import javax.swing.JButton;

/**
 * Create a main class for set the game.
 * @author vivierr
 *
 */
public class Main
{
    // TODO (fixed) write comment
    
    /**
     * Run the game drawing the map.
     * @param args
     * @throws MapException
     */
    public static void main(String[] args) throws MapException
    {   
        new Game(5).play();   
        
    }

}
