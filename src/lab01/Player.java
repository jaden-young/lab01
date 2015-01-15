package lab01;

/**
 * Defines a Player object with values for name, position, whether or not they 
 * are a starter, and number.
 * @author Jaden Young
 */
public class Player {
    
    //instance variables
    private String name;
    private String position;
    private boolean starter;
    private int number;
    
    /**
     * Constructs a new Player object with values for all of the fields
     * @param xName Name of the player
     * @param xPosition Position of the player
     * @param xStarter True if player is a starter, false if not
     * @param xNumber The player's number 
     */
    public Player(String xName, String xPosition, 
                    boolean xStarter, int xNumber){
        
        name = xName;
        position = xPosition;
        starter = xStarter;
        this.setNumber(xNumber);
    }
    
    //accessor methods---------------------------------
    /**
     * Returns the name of the player
     * @return Name of the player
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the position of the player
     * @return Position of the player
     */
    public String getPosition() {
        return position;
    }
    
    /**
     * Tells whether or not the player is a starter
     * @return True if player is a starter, false if not
     */
    public boolean getStarter() {
        return starter;
    }
    
    /**
     * Returns the number of the player
     * @return Player's number
     */
    public int getNumber() {
        return number;
    }
    
    
    //mutator methods -------------------------
    /**
     * Sets the name of the player
     * @param xName New name for the player
     */
    public void setName(String xName) {
        name = xName;
    }
    
    /**
     * Sets the position of the player
     * @param xPosition New position for the player
     */
    public void setPosition(String xPosition) {
        position = xPosition;
    }
    
    /**
     * Sets whether or not the player is a starter
     * @param xStarter True if player is a starter, false if not
     */
    public void setStarter(boolean xStarter) {
        starter = xStarter;
    }
    
    /**
     * Sets the number of the player. 
     * Number must be an integer 1-99, else throws exception
     * @param xNumber 
     */
    public final void setNumber(int xNumber) {
        if (xNumber > 0 && xNumber < 100)
            number = xNumber;
        else
            throw new IllegalArgumentException("Number must be a "
                    + "whole number 1-99");
    }
}
