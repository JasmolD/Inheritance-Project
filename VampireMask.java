
/**
 * Write a description of class VampireMask here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class VampireMask extends Weapon
{
    Villains owner;
    public VampireMask(Villains owner)
    {
        super(100, 150);
        this.owner = owner;
    }

    public boolean parry()
    {
        return false;
    }

    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your mask's remaining uses are: " + this.getLife()/10);
        array.add("Your mask's attack power is: " + this.getAttackValue());
        array.add("Your mask is usable:" + this.isBroken());
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
