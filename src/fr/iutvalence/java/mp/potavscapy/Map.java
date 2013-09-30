package fr.iutvalence.java.mp.potavscapy;


/**
 *class which defines the game environment (size, number of squares)
 * 
*/
public class Map 
{
    /**
     * Defines the different types of cases with integer
     */
    public final static int WATER=0;
    public final static int TREE=1;
    public final static int SWAMP=2;
    public final static int HOLE=3;
    public final static int RIVER=4;
    
    
 /**
  *  specifies the number of squares of the map (of the side) 
  *  */   
 public int size;

 /**
  * notice we need a 2D table to build the map.
  */
 public int[][] mapSquare;
 
 /**
 * define a integer table gameMap to fill in with 0,1,2,3 or 4 according to the types of squares.
 */
int[][] gameMap = null;
gameMap = new Square[size][size];


 
}
