

/**
 * The Barlog class is a subclass of the Demon class, which is a subclass of the Creature class.
 * The Barlog is very powerful, and it can actually cause damage twice on one turn.
 * 
 * @author Greg Babbert
 * @version 11.9.2020
 */
public class Barlog extends Demon
{
    
    private static final int MAX_BARLOG_HP = 200;
    private static final int MIN_BARLOG_HP = 50;
    private static final int MAX_BARLOG_STR = 100;
    private static final int MIN_BARLOG_STR = 50;
    
    /**
     * Constructor for objects of class Barlog -
     * Note that the calling class does not need to know anything about the 
     * requirements of Barlog minimum and maximum values
     * 
     * The instantiating class asks for a Barlog and the Barlog class is responsible for
     * return a Barlog object with values in the appropriate range
     * 
     */
    public Barlog() {
       super(
            Randomizer.nextInt(MAX_BARLOG_HP-MIN_BARLOG_HP)+MIN_BARLOG_HP,    
            Randomizer.nextInt(MAX_BARLOG_STR-MIN_BARLOG_STR)+MIN_BARLOG_STR
        );   
    }

    /**
     * Creates the number used for the attack method
     * @return the damage method from the Creature class is called twice, and then
     * the sum of those two calls are added up and returned
     */
    public int damage(){
        int firstDamageCaused = super.damage();
        int secondDamageCaused = super.damage();
        int totalDamage = firstDamageCaused + secondDamageCaused;
        return totalDamage;
    }
    
}
