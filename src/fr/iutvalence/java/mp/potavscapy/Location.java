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
    public int x;
    
    /**
     * Define the second value of the location
     */
    public int y;
    
    /**
     * Create a new location to locate something (character or bonus) on the map.
     * @param X the abscissa
     * @param Y the second value of the location
     */
    public Location(int X, int Y)
    {
        this.x = X;
        this.y = Y;
    }
    

}
