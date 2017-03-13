
/**
 * Write a description of class RifleRounds here.
 * 
 * @author (Jasmol Dhesi) 
 * @version (3.6.17)
 */
import java.util.ArrayList;
public class RifleRounds extends Weapon
{
    JojoStandUsers owner;
    public RifleRounds(JojoStandUsers owner, int life)
    {
        //life = 30;
        super(30, 60);
        this.owner = owner;
    }
    
    public boolean parry()
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 80)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your remaining rounds are: " + this.getLife()/10);
        array.add("Your rounds attack power is: " + this.getAttackValue());
        array.add("Your rifle rounds are usable:" + this.isBroken());
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
