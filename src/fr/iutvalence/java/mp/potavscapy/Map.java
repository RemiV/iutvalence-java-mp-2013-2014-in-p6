package fr.iutvalence.java.mp.potavscapy;


/**
 *class which defines the game environment (size, number of squares)
 * 
*/
public class Map 
{
    // TODO (fix) comment only this constant
    /**
     * Defines the different types of cases with integer
     */
    public final static int WATER=0;
    
    // TODO (fix) comment this constant
    public final static int TREE=1;

    // TODO (fix) comment this constant
    public final static int SWAMP=2;
    
    // TODO (fix) comment this constant
    public final static int HOLE=3;
    
    // TODO (fix) comment this constant
    public final static int RIVER=4;
    
    // TODO (fix) field should be private 
 /**
  *  specifies the number of squares of the map (of the side) 
  *  */   
 public int size;

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
