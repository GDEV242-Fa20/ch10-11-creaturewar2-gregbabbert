

/**
 * The Dwarve class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Bill Crosbie
 * @version 2020-10 v1.0
 */
public class Dwarve extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DWARVE_HP = 18;
    private static final int MIN_DWARVE_HP = 8;
    private static final int MAX_DWARVE_STR = 22;
    private static final int MIN_DWARVE_STR = 8;

    /**
     * Constructor for objects of class Dwarve -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Dwarve and the elf class is responsible for
     * return a Dwarve object with values in the appropriate range
     * 
     */
    public Dwarve()
    {
        super(
            Randomizer.nextInt(MAX_DWARVE_HP-MIN_DWARVE_HP)+MIN_DWARVE_HP,    
            Randomizer.nextInt(MAX_DWARVE_STR-MIN_DWARVE_STR)+MIN_DWARVE_STR
        );
          
    }
    
    
    /**
     * Creates the number used for the attack method
     * @return a random value between the elf's minimum strength and its maximum strength,
     * and if the if statement is true then it returns the random number times two
     */
    public int damage(){
        int magicDamage = Randomizer.nextInt(20);
        int damageCaused = super.damage();
        if (magicDamage <= 3) {
            damageCaused = damageCaused * 2;
        }
        return damageCaused;
    }

    
}
