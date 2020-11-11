

/**
 * The Elf class is a subclass for the Creature superclass and it fights for the good army.
 * There's a ten percent chance that its damage method will reult in magic damage, which is
 * the elf's normal damage times two
 * 
 * @author Greg Babbert
 * @version 11.10.2020
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
