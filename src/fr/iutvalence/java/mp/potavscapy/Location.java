package fr.iutvalence.java.mp.potavscapy;

/**
 * Define the Location class designed to ease the location of
 * the characters and the bonus on the map.
 * @author vivierr
 *
 */
public class Location
{

    /**
     * Define the abscissa of the point.
     */
    // TODO (fix) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
    public int x;
    
    /**
     * Define the second value of the location
     */
    // TODO (fix) consider the field being private. Let them be public if and only if
    // you find at least a *** good *** reason to do so
    public int y;
    
    /**
     * Create a new location to locate something (character or bonus) on the map.
     * @param X the abscissa
     * @param Y the second value of the location
     */
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    

}
