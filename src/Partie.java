// TODO (fix) declare model-related classes in a package
// e.g. fr.iutvalence.java.mp.potavscapy


// TODO (fix) write a comment that really describe the intent of this class
// according to the model
/**  
 * class Partie declaration : the principal class
 */ 
// TODO (fix) rename class (english)
public class Partie
{
    // TODO (fix) simply comment, it is useless to say that it is a field declaration
    /** 
     * game begining declaration : notice the game start 
     */
    public boolean begining;
    
    // TODO (fix) simply comment, it is useless to say that it is a field declaration
    /**
     * game ending declaration : notice the game finish
     */
    public boolean ending;
    
    
    // TODO (fix) rename field
    // TODO (fix) your model must be player-independant 
    /**
     * notice if the player is against the IA (0) or against an other player (1)
     */
    public boolean multijoueur;
    
    // TODO (fix) rename field
    // TODO (fix) your model must be player-independant     
    /**
     * notice if the player choose the capybara (0) or the potamochère (1)
     */
    public boolean potamochereChoisi;
    
    // TODO (fix) clarify comment and complete it
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
