package fr.iutvalence.java.mp.potavscapy;

/**
 *
 * 
 * @author vivierr
 *
 */
public class Bonus
{
    
    /**
     * Define if the square is EMPTY
     */
    public final static int EMPTY=0;
    

    /**
     * Define the PUMPKIN bonus : it worths 10 APPLES.
     */
    public final static int PUMPKIN=1;

    /**
     * Define the ALLIGATOR bonus : the character who found it skip a turn.
     */
    public final static int ALLIGATOR=2;

    /**
     * Define the MAKI CATTA bonus : the character who found it win a turn.
     */
    public final static int MAKICATTA=3;

    /**
     * Define the ARA bonus : it prevents the next animal who will be found.
     */
    public final static int ARA=4;

    /**
     * Define the GARARUFA bonus : changes the square in a WATER square.
     */
    public final static int GARARUFA = 5;

    /**
     * Define the MAN bonus : it cuts a TREE (the square become a SWAMP).
     */
    public final static int MAN = 6;

    /**
     * Define the BEE bonus : it creates a TREE (a SWAMP become a TREE).
     */
    public final static int BEE = 7;
    
    /**
     * Define the number of apples we want in the tutorial map.
     */
    public final static int EASY_MODE_NUMBER_OF_APPLES = 5;

    /**
     * Define the number of apples we want in the medium map.
     */
    public final static int MEDIUM_MODE_NUMBER_OF_APPLES = 15;
    /**
     * Define the number of apples we want in the huge map.
     */
    public final static int HARD_MODE_NUMBER_OF_APPLES = 25; 
    
    
    /**
     * Define the APPLE bonus : the potamochère need it to win.
     */
    public int[] APPLE;
    
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
     * notice we need a 2D table to build the bonus map. All the squares of the table
     * have an integer corresponding to a type (APPLE, PUMPKIN, ARA,...).
     */
    public int[][] bonusMap;
    
    /**
     * Define the apple counter which help us to build the map to regulate the
     * apple number.
     */
    public int numberOfApples;
    
    /**
     * Initialize the grid to put the bonus and define the apple number we need.
     */
    public void initBonus(int gridSize)
    {
        numberOfApples =0;
        
        switch (gridSize)
        {
            case EASY_MODE_GRID_SIZE : numberOfApples = EASY_MODE_NUMBER_OF_APPLES;
            case MEDIUM_MODE_GRID_SIZE : numberOfApples = MEDIUM_MODE_NUMBER_OF_APPLES;
            case HARD_MODE_GRID_SIZE : numberOfApples = HARD_MODE_NUMBER_OF_APPLES;
        }
        
        for (int apple=0; apple<numberOfApples;apple++)
        {
            APPLE[apple] = 7 + apple;
        }
        for (int line=0;line<gridSize;line++)
            for (int column=0;column<gridSize;column++)
            bonusMap[line][column] = EMPTY;
        
    }
    
    /**
     * Create the bonus Map. If the size is available, we create the bonus map with initBonus.
     * @param size
     * @throws MapException
     */
    public Bonus(int size) throws MapException
    {
        if (size != EASY_MODE_GRID_SIZE || size != MEDIUM_MODE_GRID_SIZE || size != HARD_MODE_GRID_SIZE)
        {
            throw new MapException();
        }
        else
        {
            initBonus(size);
        }
    }
    
    
    
    
    
    
}
