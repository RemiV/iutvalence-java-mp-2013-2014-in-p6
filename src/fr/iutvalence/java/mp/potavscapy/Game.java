package fr.iutvalence.java.mp.potavscapy;

/**  
 * class Game declaration : the principal class. It defines all we need to set up a game of "Potamochère vs Capybara" (begin, end, character choice,
 * number of players). The rules are in the README.md.
 */ 
public class Game
{
    // TODO (fixed) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
    /** 
     * Notice the game start 
     */
    private boolean begining;

    // TODO (fixed) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
    /**
     * Notice the game finish
     */
    private boolean ending;
    
    // TODO (explain it) what is the purpose of this field?
    /**
     * notice if the player is against the IA (1) or against an other player (0).
     */
    public boolean playerIndependant;
    
    // TODO (explain it) what is the purpose of this field?
    /**
     * notice if the player choose the capybara (0) or the potamochère (1)
     */
    public boolean potamochereChosen;
    
    // TODO (explain it) what is the purpose of this field?
    /**
     * notice if it's the capybara turn (0) or the potamochère turn (1).
     */
    public boolean potamochereTurn;
    
    // TODO (fixed) rename field (just map)
    /**
     * notice a Map is used in a game. 
     */
    public Map map;
    
    // TODO (fix) write a "real" comment describing how i the game once this constructor has been called
    // TODO (fix) also document parameters
    /**
     * Install the bases : How many players (nbj) and which character is chosen (perso)
     * @param nbj 
     * @param perso 
     */
    public Game (boolean nbj, boolean perso, int sizemap)
    {
        // TODO (think about it) some fields look like local variables...
        this.playerIndependant = nbj;
        this.potamochereChosen = perso;
        this.begining = true;
        this.ending = false;
        this.potamochereTurn = true;
        this.map = new Map(sizemap);
    } 
}
