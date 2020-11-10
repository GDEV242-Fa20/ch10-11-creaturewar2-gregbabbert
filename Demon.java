

/**
 * The Demon class is a subclass of the Creature class. It will never actually get instantiated,
 * it's only purpose if to create a new Damage method for the Demon subclasses to use
 * 
 * @author Greg Babbert
 * @version 11.9.2020
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;
    private int str;
    private int hp;
    
    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Demon(int str, int hp) {
       super(
            str, hp
        );
    
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        
          
    }
    /**
     * Creates the number used for the attack method
     * @return a random value between a Demon sublcasses' minimum strength and its maximum strength,
     * and if the if statement is true then it returns the random number plus fifty
     */
    public int damage(){
        int magicDamage = Randomizer.nextInt(20);
        int damageCaused = super.damage();
        if (magicDamage == 1) {
            damageCaused = damageCaused + 50;
        }
        return damageCaused;
    }

    
}
