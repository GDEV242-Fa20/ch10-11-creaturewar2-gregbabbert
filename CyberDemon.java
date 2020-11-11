

/**
 * The CyberDemon class is a subclass of the Demon class, which is a subclass of the Creature class.
 * It doesn't have any special properties, it just uses the Demon damage method intead of the Creature's method.
 * 
 * @author Greg Babbert
 * @version 11.9.2020
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBER_HP = 100;
    private static final int MIN_CYBER_HP = 25;
    private static final int MAX_CYBER_STR = 40;
    private static final int MIN_CYBER_STR = 20;
    
    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of CyberDemon minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the CyberDemon class is responsible for
     * return a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon() {
       super(
            Randomizer.nextInt(MAX_CYBER_HP-MIN_CYBER_HP)+MIN_CYBER_HP,    
            Randomizer.nextInt(MAX_CYBER_STR-MIN_CYBER_STR)+MIN_CYBER_STR
        );   
    }

    
}
