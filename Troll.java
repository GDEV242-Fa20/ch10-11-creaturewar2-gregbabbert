

/**
 * The Troll class is a subclass of the Demon class, which is a subclass of the Creature class.
 * The Troll fights for the bad army, and even though Trolls are very big and strong, they're often
 * portrayed as being slow and not very smart. The because of this the Troll has the capability
 * of having very good HP and strength, but it's also possible that they won't attack on their turn.
 * 
 * @author Greg Babbert
 * @version 11.10.2020
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
     * Trolls are really strong, but they aren't very fast or smart.
     * The if statement determines whether the Troll attacked during a round.
     * If the if statment is true, then the Troll was too slow and their attack is 0
     * @return a random value between the Troll class' minimum strength and its maximum strength,
     * unless the if statment is true and then it returns an attack of 0
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
