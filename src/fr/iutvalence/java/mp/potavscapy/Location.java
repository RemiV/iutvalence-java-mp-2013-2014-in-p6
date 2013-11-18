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
    private final int x;

    /**
     * Define the second value of the location
     */    
    private final int y;
    
    
    /**
     * Create a new location to locate something (character or bonus) on the
     * map.
     * 
     * @param x
     *            the abscissa
     * @param y
     *            the ordinate of the location
     */
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // TODO (fixed) finish writing comment
    /**
     * get the abscissa of the location.
     */
    public int getX()
    {
        return this.x;
    }

    // TODO (fixed) finish writing comment
    /**
     *  get the ordinate of the location.
     */
    public int getY()
    {
        return this.y;
    }
    


}
