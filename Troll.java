

/**
 * The Troll class is a subclass of the Creature class. It will never actually get instantiated,
 * it's only purpose if to create a new Damage method for the Troll subclasses to use
 * 
 * @author Greg Babbert
 * @version 11.9.2020
 */
public class Troll extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_TROLL_HP = 300;
    private static final int MIN_TROLL_HP = 100;
    private static final int MAX_TROLL_STR = 150;
    private static final int MIN_TROLL_STR = 75;
    
    /**
     * Constructor for objects of class Troll -
     * Note that the calling class does not need to know anything about the 
     * requirements of Troll minimum and maximum values
     * 
     * The instantiating class asks for a Troll and the Troll class is responsible for
     * return a Troll object with values in the appropriate range
     * 
     */
    public Troll() {
       super(
            Randomizer.nextInt(MAX_TROLL_HP-MIN_TROLL_HP)+MIN_TROLL_HP,    
            Randomizer.nextInt(MAX_TROLL_STR-MIN_TROLL_STR)+MIN_TROLL_STR
        );   
    }

    /**
     * Creates the number used for the attack method
     * @return a random value between a Demon sublcasses' minimum strength and its maximum strength,
     * and if the if statement is true then it returns the random number plus fifty
     */
    public int damage(){
        int chance = Randomizer.nextInt(10);
        int damageCaused = super.damage();
        if (chance <= 4) {
            damageCaused = 0;
        }
        return damageCaused;
    }
    
}
