
/**
 * Write a description of class Bazooka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Bazooka extends Weapon
{
    public Bazooka(int life)
    {
        super(10, 250);

    }

    public boolean parry()
    {
        return false;
    }

    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your Bazooka's hp is: " + this.getLife());
        array.add("Your Bazooka's attack power is: " + this.getAttackValue());
        array.add("Your Stand Requiem is usable:" + this.isBroken());
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