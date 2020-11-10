

/**
 * The Demon class is a subclass of the Creature class. It will never actually get instantiated,
 * it's only purpose if to create a new Damage method for the Demon subclasses to use
 * 
 * @author Greg Babbert
 * @version 11.9.2020
 */
public class Demon extends Creature
{
    
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
