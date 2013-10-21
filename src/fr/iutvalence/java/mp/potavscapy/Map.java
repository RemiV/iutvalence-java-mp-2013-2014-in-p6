package fr.iutvalence.java.mp.potavscapy;

import java.util.Random;

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
     * Define the number of tree we want in the tutorial map.
     */
    public final static int TREE_IN_TUTO = 5;

    /**
     * Define the number of tree we want in the medium map.
     */
    public final static int TREE_IN_MEDIUM = 20;
    
    /**
     * Define the number of tree we want in the huge map.
     */
    public final static int TREE_IN_HUGE = 60;
    
    /**
     * Define the APPLE bonus : the potamochère need it to win.
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location apple;

    /**
     * Define the PUMPKIN bonus : it worths 10 APPLES.
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location pumpkin;

    /**
     * Define the ALLIGATOR bonus : the character who found it skip a turn.
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location alligator;

    /**
     * Define the MAKI CATTA bonus : the character who found it win a turn.
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location makiCatta;

    /**
     * Define the ARA bonus : it prevents the next animal who will be found.
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location ara;

    /**
     * Define the GARARUFA bonus : changes the square in a WATER square.
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location gararufa;

    /**
     * Define the MAN bonus : it cuts a TREE (the square become a SWAMP).
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location man;

    /**
     * Define the BEE bonus : it creates a TREE (a SWAMP become a TREE).
     */
    // TODO (fixed) consider the field being private. Let them be public if and
    // only if
    // you find at least a *** good *** reason to do so
    // TODO (fixed) comply with naming convention
    private Location bee;

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
    
    /**
     * Define the tree counter which help us to build the map to regulate the tree number.
     */
    private int treeCounter;
    
    /**
     * Define the square counter which help us to finish the map, positioning swamp squares.
     */
    private int squareCounter;
   

    // TODO (fix) finish writing comment (parameters)
    /**
     * constructor Map which specifies the current attributes of the chosen map
     * 
     * @param size
     * @throws MapException
     */
    

    public Map(int size) throws MapException
    {
        treeCounter = 0;
        squareCounter = 0;
        if (size != TUTO || size != MEDIUM || size != HUGE)
        {
            throw new MapException();
        }
        else if (size == TUTO)
        {
            this.size = size;
            int xForWater1 = new Random().nextInt(1);
            int yForWater1 = new Random().nextInt(1);
            mapSquare[xForWater1][yForWater1] = WATER;
            int xForWater2 = 3 + new Random().nextInt(1);
            int yForWater2 = 3 + new Random().nextInt(1);
            mapSquare[xForWater2][yForWater2] = WATER;
            while (treeCounter != TREE_IN_TUTO )
            {
                int xForTree = new Random().nextInt(size);
                int yForTree = new Random().nextInt(size);
                if (mapSquare[xForTree][yForTree] != WATER)
                {
                    mapSquare[xForTree][yForTree] = TREE;
                    treeCounter = treeCounter + 1;
                }
            }
                
           
            }
        else if (size == MEDIUM)
        {
            this.size = size;
            int xForWater1 = new Random().nextInt(4);
            int yForWater1 = new Random().nextInt(4);
            mapSquare[xForWater1][yForWater1] = WATER;
            int xForWater = 6 + new Random().nextInt(4);
            int yForWater = 6 + new Random().nextInt(4);
            mapSquare[xForWater2][yForWater2] = WATER;
            while (treeCounter != TREE_IN_MEDIUM )
            {
                int xForTree = new Random().nextInt(size);
                int yForTree = new Random().nextInt(size);
                if (mapSquare[xForTree][yForTree] != WATER)
                {
                    mapSquare[xForTree][yForTree] = TREE;
                    treeCounter = treeCounter + 1;
                }
            }
        }
        else 
        {
            this.size = size;
            int xForWater1 = new Random().nextInt(6);
            int yForWater1 = new Random().nextInt(6);
            mapSquare[xForWater1][yForWater1] = WATER;
            int xForWater = 8 + new Random().nextInt(6);
            int yForWater = 8 + new Random().nextInt(6);
            mapSquare[xForWater2][yForWater2] = WATER;
            while (treeCounter != TREE_IN_HUGE )
            {
                int xForTree = new Random().nextInt(size);
                int yForTree = new Random().nextInt(size);
                if (mapSquare[xForTree][yForTree] != WATER)
                {
                    mapSquare[xForTree][yForTree] = TREE;
                    treeCounter = treeCounter + 1;
                }
            }
        }
        while (squareCounter != (size * size))
        {
            int xMap = 0;
            int yMap = 0;
            if (mapSquare[xMap][yMap] != WATER || mapSquare[xMap][yMap] != SWAMP)
            {
                mapSquare[xMap][yMap] = SWAMP;
                squareCounter = squareCounter + 1;
                xMap = xMap + 1;
                yMap = yMap + 1;
            }
            else
            {
                squareCounter = squareCounter + 1;
                xMap = xMap + 1;
                yMap = yMap + 1;
            }
        }

    }

}
