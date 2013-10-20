package fr.iutvalence.java.mp.potavscapy;

/**
 * class which defines the game environment (size, number of squares)
 * 
 */
public class Map
{
    /**
     * Define the WATER case : The capybara must link two WATER squares to win.
     */
    public final static int WATER = 0;

    /**
     * Define the TREE case : No animal can be on TREE squares.
     */
    public final static int TREE = 1;

    /**
     * Define the SWAMP case : It's the basic square, all the animals can be on
     * there.
     */
    public final static int SWAMP = 2;

    /**
     * Define the HOLE case : When the potamochère dig a SWAMP square, this
     * square become a HOLE square.
     */
    public final static int HOLE = 3;

    /**
     * Define the RIVER case : When the capybara dig a SWAMP square, this square
     * become a RIVER square.
     */
    public final static int RIVER = 4;

    /**
     * Define the size TUTO: it's a little map to learn the bases (5x5 squares).
     */
    public final static int TUTO = 5;

    /**
     * Define the size MEDIUM : it's a normal map (10x10 squares) for simple
     * games.
     */
    public final static int MEDIUM = 10;

    /**
     * Define the size HUGE : it's a big map (15x15 squares) for players who
     * want challenges.
     */
    public final static int HUGE = 15;

    /**
     * Define the APPLE bonus : the potamochère need it to win.
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location APPLE;

    /**
     * Define the PUMPKIN bonus : it worths 10 APPLES.
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location PUMPKIN;

    /**
     * Define the ALLIGATOR bonus : the character who found it skip a turn.
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location ALLIGATOR;

    /**
     * Define the MAKI_CATTA bonus : the character who found it win a turn.
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location MAKI_CATTA;

    /**
     * Define the ARA bonus : it prevents the next animal who will be found.
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location ARA;

    /**
     * Define the GARARUFA bonus : changes the square in a WATER square.
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location GARARUFA;

    /**
     * Define the MAN bonus : it cuts a TREE (the square become a SWAMP).
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location MAN;

    /**
     * Define the BEE bonus : it creates a TREE (a SWAMP become a TREE).
     */
    // TODO (fix) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fix) comply with naming convention
    public Location BEE;

    /**
     * specifies the number of squares of the map (of the side)
     * */
    private int size;

    /**
     * notice we need a 2D table to build the map. All the squares of the table
     * have an integer corresponding to a type (SWAMP, TREE, WATER, HOLE and
     * RIVER).
     */
    private int[][] mapSquare;

    // TODO (fix) finish writing comment (parameters)
    /**
     * constructor Map which specifies the current attributes of the chosen map
     * 
     * @param size
     * @throws MapException
     */

    public Map(int size) throws MapException
    {
        if (size != TUTO || size != MEDIUM || size != HUGE)
        {
            throw new MapException();
        }
        else
        {
            this.size = size;
            Random.nextInt(4);
        }

    }

}
