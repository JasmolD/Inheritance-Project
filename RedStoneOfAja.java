
/**
 * Write a description of class RedStoneOfAja here.
 * 
 * @author (Jasmol Dhesi) 
 * @version (3.6.17)
 */
import java.util.ArrayList;
public class RedStoneOfAja extends Weapon
{
    JoJo owner;
    public RedStoneOfAja(JoJo owner, int life)
    {
        super(10, 250);
        this.owner = owner;
    }

    public boolean parry()
    {
        return false;
    }

    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your remaining uses of the Stone are: " + this.getLife()/10);
        array.add("Your Stone's attack power is: " + this.getAttackValue());
        array.add("Your Stone is usable:" + this.isBroken());
        return array;
    }

    public void takeDamage(int dmg)
    {
        life-=dmg;
    }
    
    public boolean isBroken()
    {
        if (this.getLife() <=0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public int attack(){
        this.takeDamage(10);
        return this.getAttackValue();
    }
}
