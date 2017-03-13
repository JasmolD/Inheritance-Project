
/**
 * Abstract class Villains - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Villains extends Enemy
{
    int atk;
    public Villains(int hp, int attack)
    {
        super(hp);
        atk=attack;
    }
    
    public void gainAttack(int atk) {
        damage += atk;
    }
    
    public void gainHealth(int hp) {
        hitpoints += hp;
    }
}
