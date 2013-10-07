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

 // TODO (fixed) field should be private
 // TODO (fixed) simplify comment, but also detail it ;-)
 /**
  * notice we need a 2D table to build the map. All the squares of the table have an integer
  * corresponding to a type (SWAMP, TREE, WATER, HOLE and RIVER).
  */
 private int[][] mapSquare;
 
 /**
  * constructor Map which specifies the current attributes of the chosen map 
  * @param size
  * @throws MapException
  */

 public Map(int size) throws MapException
 {
     if (size != 5 || size != 10 || size != 15) 
         throw new MapException(); 
     
 }
 
 

 
}
