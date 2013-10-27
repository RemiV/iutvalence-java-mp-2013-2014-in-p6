package fr.iutvalence.java.mp.potavscapy;

/**
 * Define the Location class designed to ease the location of the characters and
 * the bonus on the map.
 * 
 * @author vivierr
 * 
 */
public class Location
{

    /**
     * Define the abscissa of the point.
     */  
    // TODO (fix) make this field immutable
    private int x;

    /**
     * Define the second value of the location
     */
    // TODO (fix) make this field immutable    
    private int y;
    
    /**
     * Create a new location to locate something (character or bonus) on the
     * map.
     * 
     * @param x
     *            the abscissa
     * @param y
     *            the second value of the location
     */
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // TODO (fix) declare getters

}
