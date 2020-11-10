import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    // instance variables - replace the example below with your own
    private ArrayList goodArmy;
    private Creature creatureArray[];

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        ArrayList<Creature> goodArmy = new ArrayList<Creature>();
        ArrayList<Creature> badArmy = new ArrayList<Creature>();
    }
    
    public ArrayList<Creature> createGoodArmy(){
        ArrayList<Creature> goodArmy = new ArrayList<Creature>();
        for (int i = 1; i <= 100; ++i){
            int type = Randomizer.nextInt(10);
            if (type <= 6) {
                goodArmy.add(new Human());
            } else {
                goodArmy.add(new Elf());
            }
        }
        return goodArmy;
    }
    
    public ArrayList<Creature> createBadArmy(){
        ArrayList<Creature> badArmy = new ArrayList<Creature>();
        int badArmySize = Randomizer.nextInt(50-30)+30;
        for (int i = 1; i <= badArmySize; ++i){
            int type = Randomizer.nextInt(25);
            if (type <= 18) {
                badArmy.add(new Human());
            } else if (type <= 24) {
                badArmy.add(new CyberDemon());
            } else {
                badArmy.add(new Barlog());
            }
        }
        return badArmy;
    }
    
    public void test() {
        ArrayList<Creature> goodArmy = createGoodArmy();
        ArrayList<Creature> badArmy = createBadArmy();
        System.out.println(goodArmy);
        System.out.println(badArmy);
    }
    
}
