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
            if (type <= 5) {
                goodArmy.add(new Human());
            } else if (type <=7) {
                goodArmy.add(new Dwarve());
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
            if (type <= 15) {
                badArmy.add(new Human());
            } else if (type <= 22) {
                badArmy.add(new CyberDemon());
            } else if (type <= 24) {
                badArmy.add(new Troll());
            } else {
                badArmy.add(new Barlog());
            }
        }
        return badArmy;
    }
    
    public void battle() {
        ArrayList<Creature> goodArmy = createGoodArmy();
        ArrayList<Creature> badArmy = createBadArmy();
        System.out.println(goodArmy);
        System.out.println(badArmy);
        while (goodArmy.get(0).isAlive() && badArmy.get(0).isAlive()) {
            goodArmy.get(0).takeDamage(badArmy.get(0).damage());
            badArmy.get(0).takeDamage(goodArmy.get(0).damage());
            if (goodArmy.get(0).isKnockedOut() && badArmy.get(0).isKnockedOut()){
                goodArmy.remove(0);
                badArmy.remove(0);
            }
            else if (goodArmy.get(0).isKnockedOut()){
                goodArmy.remove(0);
            }
            else if (badArmy.get(0).isKnockedOut()){
                badArmy.remove(0);
            }
            
            if (goodArmy.size() == 0){
                System.out.println("The bad army won!");
                break;
            }
            if (badArmy.size() == 0){
                System.out.println("The good army won!");
                break;
            }
        }
        
    }
    
}
