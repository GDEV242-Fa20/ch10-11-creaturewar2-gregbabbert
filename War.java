import java.util.ArrayList;
/**
 * The War class is used to create the final battle between the good and bad armies. The War class creates two
 * ArrayLists, one for each of the armies, and then it fills those lists with different types of Creatures.
 * The methods used to fill the ArrayLists are createGoodArmy and createBadArmy. To have the battle take
 * place the user class the method battle, which then returns who wins the battle.
 *
 * @author Greg Babbert
 * @version 11.10.2020
 */
public class War
{
    
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
    
    
    /**
     * This method is used to create the good army, which is filled with Creatures
     * of types Human, Dwarve, and Elf.
     * @return a good army
     */
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
    
    
    /**
     * This method is used to create the bad army, which is filled with Creatures
     * of types Human, CyberDemon, Troll, and Barlog.
     * @return a bad army
     */
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
    
    
    
    /**
     * This method is used to simulate the battle between the good and bad armies.
     * Each army send one creature to fight, then those two creatures fight. If one or both of
     * the creatures are killed, then those creatures are removed from their army's list and
     * the next creatures from the armies are sent to fight. The loop breaks when there are no more
     * creatures from the good or bad army to fight. The winner of the battle is then printed.
     */
    public void battle() {
        ArrayList<Creature> goodArmy = createGoodArmy();
        ArrayList<Creature> badArmy = createBadArmy();
        
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
