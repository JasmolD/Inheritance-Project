
/**
 * Write a description of class SShield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MetalShield extends Defenders
{
    public MetalShield(int life)
    {
        super(50, 25);
    }

    public boolean blocked()
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 70)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void metalTakesDamage(int dmg)
    {
        life-=dmg;
    }
    
    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your remaining uses of the Metal Shield are: " + this.getLife()/10);
        array.add("Your shield's defense value is: " + this.getDefenseValue());
        return array;
    }

    public int Defense(){
        this.takeDamage(10);
        return this.getDefenseValue();
    }
}
