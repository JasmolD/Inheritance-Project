
/**
 * Write a description of class ZaArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ZaArrowRequiem extends Weapon
{
    JojoStandUsers owner;
    public ZaArrowRequiem(JojoStandUsers owner)
    {
        super(10, 200);
        this.owner = owner;
    }

    public boolean parry()
    {
        return false;
    }

    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your Stand Requiem's hp is: " + this.getLife());
        array.add("Your Stand Requiem's attack power is: " + this.getAttackValue());
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
        this.takeDamage(5);
        return this.getAttackValue();
    }
}
