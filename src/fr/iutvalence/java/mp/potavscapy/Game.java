// TODO (fixed) declare model-related classes in a package
package fr.iutvalence.java.mp.potavscapy;



// TODO (fixed) write a comment that really describe the intent of this class
// according to the model
/**  
 * class Game declaration : the principal class. It defines all we need to set up a game of "Potamochère vs Capybara" (begin, end, character choice,
 * number of players). The rules are in the README.md.
 */ 
// TODO (fixed) rename class (english)
public class Game
{
    // TODO (fixed) simply comment, it is useless to say that it is a field declaration
    /** 
     * Notice the game start 
     */
    public boolean begining;
    
    // TODO (fixed) simply comment, it is useless to say that it is a field declaration
    /**
     * Notice the game finish
     */
    public boolean ending;
    
    
    // TODO (fixed) rename field
    // TODO (fixed) your model must be player-independant 
    /**
     * notice if the player is against the IA (1) or against an other player (0)
     */
    public boolean playerIndependant;
    
    // TODO (fixed) rename field
    // TODO (fixed) your model must be player-independant     
    /**
     * notice if the player choose the capybara (0) or the potamochère (1)
     */
    public boolean potamochereChosen;
    
    /**
     * notice if it's the capybara turn (0) or the potamochère turn (1).
     */
    public boolean potamochereTurn;
    
    // TODO (fixed) clarify comment and complete it
    /**
     * Install the bases : How many players (nbj) and which character is chosen (perso)
     * @param nbj 
     * @param perso 
     */
    public Game (boolean nbj, boolean perso)
    {
        this.playerIndependant = nbj;
        this.potamochereChosen = perso;
        this.begining = true;
        this.ending = false; 
    } 
}
