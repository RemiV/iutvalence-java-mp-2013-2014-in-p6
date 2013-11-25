package fr.iutvalence.java.mp.potavscapy;

import java.util.Random;

/**
 * class Game declaration : the principal class. It defines all we need to set
 * up a game of "Potamochère vs Capybara" (begin, end, character choice, number
 * of players). The rules are in the README.md.
 */
public class Game
{
    // TODO (fix) this looks pretty like a local variable instead of a field
    /**
     * Notice the game start
     */
    private boolean beginning;

    // TODO (fix) this looks pretty like a local variable instead of a field
    /**
     * Notice the game finish
     */
    private boolean ending;

    /**
     * Define a new player : the capybara.
     */
    private Player capybara;
    

    /**
     * Define the second player : the potamochère.
     */
    private Player potamochere;

    // TODO (fix) this looks pretty like a local variable instead of a field
    /**
     * notice if it's the capybara turn (0) or the potamochère turn (1).
     */
    public boolean potamochereTurn;

    /**
     * notice a Map is used in a game.
     */
    private Landscape map;
    
    /**
     * notice we need the bonus map in the game.
     */
    private Bonus bonusMap;
    
    /**
     * Put the bonus in function of the landscape and the map size.
     */
    public void putBonus(Landscape map, Bonus bonus)
    {
        bonus.numberOfApples = 0;
       int gridSize = map.getSize();
       switch (gridSize)
       {
           case map.EASY_MODE_GRID_SIZE : bonus.numberOfApples = bonus.EASY_MODE_NUMBER_OF_APPLES;
           case map.MEDIUM_MODE_GRID_SIZE : bonus.numberOfApples = bonus.MEDIUM_MODE_NUMBER_OF_APPLES;
           case map.HARD_MODE_GRID_SIZE : bonus.numberOfApples = bonus.HARD_MODE_NUMBER_OF_APPLES;
       }
           for(int i=0; i<=bonus.numberOfApples; i++)
           {
           int xForApple = new Random().nextInt(gridSize);
           int yForApple = new Random().nextInt(gridSize);
           if ( (map.map[xForApple][yForApple] != map.WATER ) || ( map.map[xForApple][yForApple] != map.TREE ) && ( bonus.bonusMap[xForApple][yForApple] == bonus.EMPTY ) )
           {
               bonus.bonusMap[xForApple][yForApple] = bonus.APPLE[i];
           }
           }
           //put the alligator and the maki catta (all sizes).
           int xForAlli = new Random().nextInt(gridSize);
           int yForAlli = new Random().nextInt(gridSize);
           while ( (map.map[xForAlli][yForAlli] != map.WATER ) || ( map.map[xForAlli][yForAlli] != map.TREE ) && ( bonus.bonusMap[xForAlli][yForAlli] == bonus.EMPTY ) )
           {
               xForAlli = new Random().nextInt(gridSize);
               yForAlli = new Random().nextInt(gridSize);
              
           }
           bonus.bonusMap[xForAlli][yForAlli] = bonus.ALLIGATOR;
           //maki catta
           int xForMaki = new Random().nextInt(gridSize);
           int yForMaki = new Random().nextInt(gridSize);
           while ( (map.map[xForMaki][yForMaki] != map.WATER ) || ( map.map[xForMaki][yForMaki] != map.TREE ) && ( bonus.bonusMap[xForMaki][yForMaki] == bonus.EMPTY ) )
           {
               xForMaki = new Random().nextInt(gridSize);
               yForMaki = new Random().nextInt(gridSize);
               
           }
           bonus.bonusMap[xForMaki][yForMaki] = bonus.MAKICATTA;
           //if the size is MEDIUM or HUGE, we continue to put bonus on the map.
           if(gridSize != map.EASY_MODE_GRID_SIZE) //put the ara, the gararufa and the pumpkin only for medium and Huge map
           {
               int xForAra = new Random().nextInt(gridSize);
               int yForAra = new Random().nextInt(gridSize);
               while ( (map.map[xForAra][yForAra] != map.WATER ) || ( map.map[xForAra][yForAra] != map.TREE ) && ( bonus.bonusMap[xForAra][yForAra] == bonus.EMPTY ) )
               {
                   xForAra = new Random().nextInt(gridSize);
                   yForAra = new Random().nextInt(gridSize);
                   
               }
               bonus.bonusMap[xForAra][yForAra] = bonus.ARA;
               // gararufa setting
               int xForGara = new Random().nextInt(gridSize);
               int yForGara = new Random().nextInt(gridSize);
               while ( (map.map[xForGara][yForGara] != map.WATER ) || ( map.map[xForGara][yForGara] != map.TREE ) && ( bonus.bonusMap[xForGara][yForGara] == bonus.EMPTY ) )
               {
                   xForGara = new Random().nextInt(gridSize);
                   yForGara = new Random().nextInt(gridSize);
                   
               }
               bonus.bonusMap[xForGara][yForGara] = bonus.GARARUFA;
               //pumpkin setting
               int xForPumpkin = new Random().nextInt(gridSize);
               int yForPumpkin = new Random().nextInt(gridSize);
               while ( (map.map[xForPumpkin][yForPumpkin] != map.WATER ) || ( map.map[xForPumpkin][yForPumpkin] != map.TREE ) && ( bonus.bonusMap[xForPumpkin][yForPumpkin] == bonus.EMPTY ) )
               {
                   xForPumpkin = new Random().nextInt(gridSize);
                   yForPumpkin = new Random().nextInt(gridSize);
                   
               }
               bonus.bonusMap[xForPumpkin][yForPumpkin] = bonus.PUMPKIN;
           }
           //if the size is HUGE, we continue to put bonus ont he map.
           if (gridSize == map.HARD_MODE_GRID_SIZE)
           {
               // put the man and the bee bonus
               int xForMan = new Random().nextInt(gridSize);
               int yForMan = new Random().nextInt(gridSize);
               while ( (map.map[xForMan][yForMan] != map.WATER ) || ( map.map[xForMan][yForMan] != map.TREE ) && ( bonus.bonusMap[xForMan][yForMan] == bonus.EMPTY ) )
               {
                   xForMan = new Random().nextInt(gridSize);
                   yForMan = new Random().nextInt(gridSize);
                   
               }
               bonus.bonusMap[xForMan][yForMan] = bonus.MAN;
               //the bee
               int xForBee = new Random().nextInt(gridSize);
               int yForBee = new Random().nextInt(gridSize);
               while ( (map.map[xForBee][yForBee] != map.WATER ) || ( map.map[xForBee][yForBee] != map.TREE ) && ( bonus.bonusMap[xForBee][yForBee] == bonus.EMPTY ) )
               {
                   xForBee = new Random().nextInt(gridSize);
                   yForBee = new Random().nextInt(gridSize);
                   
               }
               bonus.bonusMap[xForBee][yForBee] = bonus.BEE;
           }
       }
    

    // TODO (fix) write a "real" comment describing how i the game once this
    // constructor has been called
    // TODO (fix) also document parameters
    /**
     * Install the bases : How many players (nbj) and which character is chosen
     * (perso)
     * 
     * @param nbj
     * @param perso
     * @throws MapException 
     */
    public Game(int sizemap) throws MapException
    {
        // TODO (think about it) some fields look like local variables...
        //TODO (fix) Add Bonus according to the landscape map.
        this.beginning = true;
        this.ending = false;
        this.potamochereTurn = true;
        
        this.map = new Landscape(sizemap);
        this.bonusMap = new Bonus(sizemap);
        this.putBonus(map, bonusMap);
        capybara.currentLocation = new Location(map.xForWater1, map.yForWater1);

    }

    /**
     * Defines what happen when a player was put on a square
     */
    public void arrive(Player character, Location toGo)
    {
        if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.ALLIGATOR)
        {
         character.skipTurn = true;   
        }
        else if ()
     
    }
    
    /**
     * Define the progress of the game and the rules.
     */
    public void play()
    {
        if (potamochereTurn == true)
        {
            int XToGo = potamochere.whereGo.getX();
            int YToGo = potamochere.whereGo.getY();
            if (potamochere.skipTurn == false && map.map[XToGo][YToGo] != map.WATER || map.map[XToGo][YToGo] != map.TREE )
            {
                potamochere.currentLocation = new Location(XToGo, YToGo);
                map.map[XToGo][YToGo] = map.HOLE;
                
        }
    }
}
