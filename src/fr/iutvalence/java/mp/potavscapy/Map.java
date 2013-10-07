package fr.iutvalence.java.mp.potavscapy;


/**
 *class which defines the game environment (size, number of squares)
 * 
*/
public class Map 
{
    // TODO (fixed) comment only this constant
    /**
     * Define the WATER case : The capybara must link two WATER squares to win.
     */
    public final static int WATER=0;
    
    // TODO (fixed) comment this constant
    /**
     * Define the TREE case : No animal can be on TREE squares.
     */
    public final static int TREE=1;

    // TODO (fixed) comment this constant
    /**
     * Define the SWAMP case : It's the basic square, all the animals can be on there.
     */
    public final static int SWAMP=2;
    
    // TODO (fixed) comment this constant
    /**
     * Define the HOLE case : When the potamochère dig a SWAMP square, 
     * this square become a HOLE square. 
     */
    public final static int HOLE=3;
    
    // TODO (fixed) comment this constant
    /**
     * Define the RIVER case : When the capybara dig a SWAMP square, 
     * this square become a RIVER square. 
     */
    public final static int RIVER=4;
    
    // TODO (fixed) field should be private 
 /**
  *  specifies the number of squares of the map (of the side) 
  *  */   
 private int size;

 // TODO (fix) field should be private
 // TODO (fix) simplify comment, but also detail it ;-)
 /**
  * notice we need a 2D table to build the map.
  */
 public int[][] mapSquare;
 
 
 // TODO (fix) instructions can only be written in constructors/methods
 /**
 * define a integer table gameMap to fill in with 0,1,2,3 or 4 according to the types of squares.
 */
int[][] gameMap = null;
gameMap = new Square[size][size];


 
}
