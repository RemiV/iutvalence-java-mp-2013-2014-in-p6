package fr.iutvalence.java.mp.potavscapy;

import java.util.Random;

/**
 * class which defines the game environment (size, number of squares)
 * 
 */
public class Landscape
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
    public final static int EASY_MODE_GRID_SIZE = 5;

    /**
     * Define the size MEDIUM : it's a normal map (10x10 squares) for simple
     * games.
     */
    public final static int MEDIUM_MODE_GRID_SIZE = 10;

    /**
     * Define the size HUGE : it's a big map (15x15 squares) for players who
     * want challenges.
     */
    public final static int HARD_MODE_GRID_SIZE = 15;

    /**
     * Define the number of tree we want in the tutorial map.
     */
    public final static int EASY_MODE_NUMBER_OF_TREES = 5;

    /**
     * Define the number of tree we want in the medium map.
     */
    public final static int MEDIUM_MODE_NUMBER_OF_TREES = 20;

    /**
     * Define the number of tree we want in the huge map.
     */
    public final static int HARD_MODE_NUMBER_OF_TREES = 60;

    
    


    /**
     * specifies the number of squares of the map (of the side)
     * */
    private int size;

    /**
     * notice we need a 2D table to build the map. All the squares of the table
     * have an integer corresponding to a type (SWAMP, TREE, WATER, HOLE and
     * RIVER).
     */
    public int[][] map;

    /**
     * Define the tree counter which help us to build the map to regulate the
     * tree number.
     */
    private int numberOfTrees;

    /**
     * Define the square counter which help us to finish the map, positioning
     * swamp squares.
     */
    private int numberOfSquares;

    
    /**
     * constructor Map which specifies the current attributes of the chosen map.
     * We use loops and random to put WATER, TREE and SWAMP squares:
     * We put the two WATER squares in the both sides of the map (in the 
     * top left hand corner and in the bottom right hand corner).
     * Then, we put at random TREE squares.
     * Finally, we put SWAMP in the empty squares.
     * 
     * 
     * @param gridSize 
     */
    public void initLandscape(int gridSize)
    {
//        numberOfTrees is a counter to count trees on the map.
//        numberOfSquares count the number of square we have filled.
//        xForWater1 and yForWater1 are the  location of the first WATER square.
//        xForWater2 and yForWater2 are the  location of the second WATER square.
//        xForTree and yForTree are the location of TREE squares.
//        xMap and yMap allow to cross the map to found empty squares.
        
        numberOfTrees = 0;
           
        this.size = gridSize;
        
        for (int line=0;line<gridSize;line++)
            for (int column=0;column<gridSize;column++)
            map[line][column] = SWAMP;
        
        int halfGridSize =  gridSize/2;
        int xForWater1 = new Random().nextInt(halfGridSize);
        int yForWater1 = new Random().nextInt(halfGridSize);
        map[xForWater1][yForWater1] = WATER;
        int xForWater2 = (halfGridSize + 1) + new Random().nextInt(halfGridSize);
        int yForWater2 = (halfGridSize + 1) + new Random().nextInt(halfGridSize);
        map[xForWater2][yForWater2] = WATER;

        switch (gridSize)
        {
            case EASY_MODE_GRID_SIZE : numberOfTrees = EASY_MODE_NUMBER_OF_TREES;
            case MEDIUM_MODE_GRID_SIZE : numberOfTrees = MEDIUM_MODE_NUMBER_OF_TREES;
            case HARD_MODE_GRID_SIZE : numberOfTrees = HARD_MODE_NUMBER_OF_TREES;
        }
        
        for (int tree=0; tree<numberOfTrees;tree++)
        {
            int xForTree = new Random().nextInt(gridSize+1);
            int yForTree = new Random().nextInt(gridSize+1);
            if (map[xForTree][yForTree] != WATER)
            {
                map[xForTree][yForTree] = TREE;
            }
        }       
    }
    


    // TODO (fix) finish writing comment (comment parameters)
    /**
     * constructor Map which specifies the current attributes of the chosen map.
     * We use loops and random to put WATER, TREE and SWAMP squares:
     * If the size is available, we create the map with initMap.
     * 
     * @param size
     * @throws MapException
     */
    public Landscape(int size) throws MapException
    {
        // TODO (fix) the following if/else can be simplified
        if (size != EASY_MODE_GRID_SIZE || size != MEDIUM_MODE_GRID_SIZE || size != HARD_MODE_GRID_SIZE)
        {
            throw new MapException();
        }
        else
        {
            initLandscape(size);
        }
    }
    
    /**
     * Return the map size.
     * @return
     */
    public int getSize()
    {
        return this.size;
    }
}
