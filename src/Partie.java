/**  
 * class Partie declaration : the principal class
 */ 
public class Partie
{
    
    /** 
     * game begining declaration : notice the game start 
     */
    public boolean begining;
    
    
    /**
     * game ending declaration : notice the game finish
     */
    public boolean ending;
    
    
    /**
     * notice if the player is against the IA (0) or against an other player (1)
     */
    public boolean multijoueur;
    
    
    /**
     * notice if the player choose the capybara (0) or the potamochère (1)
     */
    public boolean potamochereChoisi;
    
    
    /**
     * Install the base : How many players (nbj) and which character is chosen (perso)
     * @param nbj 
     * @param perso 
     */
    public Partie (boolean nbj, boolean perso)
    {
        this.multijoueur = nbj;
        this.potamochereChoisi = perso;
        this.begining = true;
        this.ending = false;
       
    } 
    
}
