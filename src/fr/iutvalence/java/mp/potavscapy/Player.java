package fr.iutvalence.java.mp.potavscapy;

/**
 * Define the type of player and what he must do.
 * 
 * @author vivierr
 * 
 */
public class Player
{

    /**
     * Define the position where the player is.
     */
    // TODO (fix) should be private
    public Location currentLocation;
    
    /**
     * Define the square where the player want to go.
     */
    // TODO (fix) should be private
    public Location whereGo;

    /**
     * Define the square where the player want to use his Man or his Bee.
     */
    // TODO (fix) should be private
    public Location whereBonus;
    
    /**
     * Define if the player win.
     */
    private boolean winner;
    
    /**
     * Define if the player loose.
     */
    private boolean looser;
    
    /**
     * The player become the winner.
     */
    public void win()
    {
        this.winner=true;
    }
    
    /**
     * The player become the looser.
     */
    public void loose()
    {
        this.looser=true;
    }
    
    /**
     * Define if the player must skip his turn or not;
     */
    private boolean skipTurn;
    
    /**
     * Define if the player must stay his turn or not;
     */
    private boolean stayTurn;
    
    /**
     * boolean variable which announces for a player if it's his turn to play
     */
    private boolean turn;
    
    /**
     * defines if the player have an Ara (to skip a bonus)
     */
    private boolean bird;
    
    
    // TODO (fix) constructor, methods ?
    /**
     * constructor of the Player object (creates a new player)
     * @param t
     */
    public Player (boolean t)
    {
        this.turn=t;
        this.skipTurn=false;
        this.stayTurn=false;
        this.bird=false;
        this.winner=false;
        this.looser=false;
    }
    
    /**
     * methode to make a player skip turn
     */
    public void setSkipTurn ()
    {
        if (this.skipTurn==false)
            this.skipTurn=true;
        else this.skipTurn=false;
    }
    
    /**
     * bird getter
     */
    public boolean getBird()
    {
        return this.bird;
    }
    
    /**
     * bird setter
     */
    public void setBird()
    {
        if (this.bird==true)
                this.bird=false;
        else this.bird=true;
    }
    
    /**
     * turn getter
     */
    public boolean getTurn()
    {
        if (this.skipTurn==true)
            {
            return false;
            }
        if (this.stayTurn==true)
        {
            return true;
        }
        return true;
    }
    
    /**
     * current location getter
     */
    public Location getCurrentLocation()
    {
        return this.currentLocation;
    }
    
    /**
     * turn setter
     */
    public void setTurn()
    {
        if (this.turn==true)
            this.turn=false;
        else this.turn=true;
    }
    
    /**
     * methode to make a player stay his turn
     */
    public void setStayTurn()
    {
        if (this.stayTurn==false)
            this.stayTurn=true;
        else this.stayTurn=false;
    }
    

}
