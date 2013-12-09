package fr.iutvalence.java.mp.potavscapy;

import java.util.Random;
import java.util.Scanner;

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
    
    /**
     * counter which gives the number of apples discovered by potamochère
     */
    private int AppleCounter;

    /**
     * Define how many apple the potamochère need.
     */
    public int AppleToWin;
    
    
    /**
     * Define how many apples we need in the easy mode
     */
    public final static int APPLE_TO_WIN_TUTO = 3;
    
    /**
     * Define how many apples we need in the medium mode
     */
    public final static int APPLE_TO_WIN_MEDIUM = 10;
    
    /**
     * Define how many apples we need in the hard mode
     */
    public final static int APPLE_TO_WIN_HARD = 15;
    
    // TODO (fix) this looks pretty like a local variable instead of a field
    /**
     * notice if it's the capybara turn (0) or the potamochère turn (1).
     */
    // TODO (fix) should be private
    public boolean potamochereTurn;

    /**
     * notice a Map is used in a game.
     */
    private Landscape map;
    
    /**
     * notice we need the bonus map in the game.
     */
    private Bonus bonusMap;
    
    // TODO (fix) finish writing comment (parameters)
    /**
     * Put the bonus in function of the landscape and the map size.
     */
    // TODO (fix) should be private
    public void putBonus(Landscape map, Bonus bonus)
    {
        bonus.numberOfApples = 0;
       int gridSize = map.getSize();
       switch (gridSize)
       {        
           // TODO (fix) fix warning
           case Landscape.EASY_MODE_GRID_SIZE : bonus.numberOfApples = bonus.EASY_MODE_NUMBER_OF_APPLES;
           case Landscape.MEDIUM_MODE_GRID_SIZE : bonus.numberOfApples = bonus.MEDIUM_MODE_NUMBER_OF_APPLES;
           case Landscape.HARD_MODE_GRID_SIZE : bonus.numberOfApples = bonus.HARD_MODE_NUMBER_OF_APPLES;
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
    // TODO (fix) move the constructor after field and before methods
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
        this.beginning = true;
        this.ending = false;
        this.potamochere = new Player(true);
        this.capybara = new Player(false);
        this.map = new Landscape(sizemap);
        this.bonusMap = new Bonus(sizemap);
        this.putBonus(map, bonusMap);
        capybara.currentLocation = new Location(map.xForWater1, map.yForWater1);

    }

    /**
     * Defines what happen when a player was put on a square
     */
    private void arrive(Player character, Location toGo)
    {
        
        int XToGo = toGo.getX();
        int YToGo = toGo.getY();
        
        if (character.getBird()== false) //if the player don't have the bird, we check the animals
        {
            
        if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.ALLIGATOR)
        {
         character.setSkipTurn() ;
         
        }
        else if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.ARA)
        {
            character.setBird();
        }
        else if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.GARARUFA)
        {
            this.map.map[XToGo][YToGo]= map.WATER;
        }
        
        else if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.MAKICATTA)
        {
            character.setStayTurn();
        }
        else if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.MAN)
        {
            Scanner XChoosen = new Scanner(System.in);
            int X = XChoosen.nextInt();
            Scanner YChoosen = new Scanner(System.in);
            int Y = YChoosen.nextInt();
            Location toUproot = new Location(X, Y); 
            this.uproot(toUproot);
        }
        
        else if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.BEE)
        {
            Scanner XChoosen = new Scanner(System.in);
            int X = XChoosen.nextInt();
            Scanner YChoosen = new Scanner(System.in);
            int Y = YChoosen.nextInt();
            Location toPlant = new Location(X, Y); 
            this.plant(toPlant);
        }
        
        }// end of the animal checking
        
        
        if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.APPLE)
        {
           this.AppleCounter=this.AppleCounter+1; 
        }
        if (this.bonusMap.bonusMap[XToGo][YToGo] == Bonus.PUMPKIN)
        {
            this.AppleCounter=this.AppleCounter+10;
        }
        

        this.bonusMap.bonusMap[XToGo][YToGo] = Bonus.EMPTY;
    }
    
    /**
     * to eradicate a tree in a location
     */
    private void uproot(Location toUproot)
    {
        int XToUproot = toUproot.getX();
        int YToUproot = toUproot.getY();
        if (this.map.map[XToUproot][YToUproot] == this.map.TREE)
            this.map.map[XToUproot][YToUproot] = this.map.SWAMP;    
    }
    
    /**
     * To plant a tree on a swamp case
     */
    private void plant(Location toPlant)
    {
        int XToPlant = toPlant.getX();
        int YToPlant = toPlant.getY();
        if (this.capybara.currentLocation != toPlant && this.map.map[XToPlant][YToPlant] == this.map.SWAMP)
            this.map.map[XToPlant][YToPlant] = this.map.TREE;
    }
    

    /**
     * Define the progress of the game and the rules.
     */
    public void play()
    {
        switch(this.map.getSize())
        {
        case Landscape.EASY_MODE_GRID_SIZE:
            AppleToWin = APPLE_TO_WIN_TUTO;
        case Landscape.MEDIUM_MODE_GRID_SIZE:
            AppleToWin = APPLE_TO_WIN_MEDIUM;
        case Landscape.HARD_MODE_GRID_SIZE:
            AppleToWin = APPLE_TO_WIN_HARD;
        }
        while (this.ending == false)
        {
            System.out.println(this.toString());
        // TODO (fix) simplify test
        if (potamochere.getTurn() == true)
        {
            int XToGo = potamochere.whereGo.getX();
            int YToGo = potamochere.whereGo.getY();
            if ( potamochere.getTurn() != false && map.map[XToGo][YToGo] != map.WATER || map.map[XToGo][YToGo] != map.TREE || map.map[XToGo][YToGo] != map.RIVER)
            {
                potamochere.currentLocation = new Location(XToGo, YToGo);
                map.map[XToGo][YToGo] = map.HOLE;
                this.arrive(potamochere, potamochere.currentLocation);
                potamochere.setTurn();
                
             }
        }
        else
        {
            int XToGo = capybara.whereGo.getX();
            int YToGo = capybara.whereGo.getY();
            //TODO (fixed) capybara can move only on square next him
            if(capybara.getCurrentLocation().getX()-1 <= XToGo && capybara.getCurrentLocation().getX()+1 >= XToGo || capybara.getCurrentLocation().getY()-1 <= YToGo && capybara.getCurrentLocation().getY()+1 >= YToGo)
            {
                if (map.map[XToGo][YToGo] != map.HOLE || map.map[XToGo][YToGo] != map.TREE)
                {
                    capybara.currentLocation = new Location(XToGo, YToGo);
                    map.map[XToGo][YToGo] = map.RIVER;
                    this.arrive(capybara, capybara.currentLocation);
                    capybara.setTurn();
                }
            }
                
        }
        
        if ( AppleCounter == AppleToWin)
        {
            potamochere.win();
            capybara.loose();
            this.ending = true;
        }
        if (capybara.getCurrentLocation().getX()== map.xForWater2 && capybara.getCurrentLocation().getY()== map.yForWater2)
        {
            capybara.win();
            potamochere.loose();
            this.ending = true;
        }
        
        
        }
        }
    /**
     * generate the graphic representation of the map
     */
    public String toString()
    {
        String result = "Bienvenue dans le marais !\n";
        for (int x = 0; x<= this.map.getSize(); x++)
            for(int y=0; y<= this.map.getSize(); y++)
            {
                result += "[" + this.map.map[x][y] + "]";
            }
        return result;
    }
}
