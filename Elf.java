

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Bill Crosbie
 * @version 2020-10 v1.0
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the elf class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }
    
    
    /**
     * Creates the number used for the attack method
     * @return a random value between the elf's minimum strength and its maximum strength,
     * and if the if statement is true then it returns the random number times two
     */
    public int damage(){
        int magicDamage = Randomizer.nextInt(10);
        int damageCaused = super.damage();
        if (magicDamage == 1) {
            damageCaused = damageCaused * 2;
        }
        return damageCaused;
    }

    
}
