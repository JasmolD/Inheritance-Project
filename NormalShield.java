
/**
 * Write a description of class Shield here.
 * 
 * @author (Jasmol Dhesi) 
 * @version (3.7.17)
 */
import java.util.ArrayList;
public class NormalShield extends Defenders
{
    public NormalShield(int life)
    {
        super(50, 25);
    }

    public boolean blocked()
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 60)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void takeNormalDamage(int dmg)
    {
        life-=dmg;
    }
    
    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your remaining uses of the Normal Shield are: " + this.getLife()/10);
        array.add("Your shield's defense value is: " + this.getDefenseValue());
        return array;
    }

    public int Defense(){
        this.takeDamage(10);
        return this.getDefenseValue();
    }
}