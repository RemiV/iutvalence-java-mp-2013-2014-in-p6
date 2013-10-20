package fr.iutvalence.java.mp.potavscapy;

/**  
 * class Game declaration : the principal class. It defines all we need to set up a game of "Potamochère vs Capybara" (begin, end, character choice,
 * number of players). The rules are in the README.md.
 */ 
public class Game
{
    // TODO (fix) this looks pretty like a local variable instead of a field
    /** 
     * Notice the game start 
     */
    private boolean begining;

    // TODO (fix) this looks pretty like a local variable instead of a field
    /**
     * Notice the game finish
     */
    private boolean ending;
    
    // TODO (fix) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
    /**
     * Define a new player : the capybara.
     */
    public Player capybara;
    
    // TODO (fix) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
    /**
     * Define the second player : the potamochère.
     */
    public Player potamochere;
    
    // TODO (fix) this looks pretty like a local variable instead of a field
    /**
     * notice if it's the capybara turn (0) or the potamochère turn (1).
     */
    public boolean potamochereTurn;
    
    // TODO (fixed) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
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
    public Game (int sizemap)
    {
        // TODO (think about it) some fields look like local variables...      
        this.begining = true;
        this.ending = false;
        this.potamochereTurn = true;
        this.map = new Map(sizemap);
    } 
    
    /**
     * Define the progress of the game and the rules.
     */
    public void play()
    {
        if (potamochereTurn = true)
        {
            ;
        }
    }
}
