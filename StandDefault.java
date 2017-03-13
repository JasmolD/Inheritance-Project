
/**
 * Write a description of class StandDefault here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class StandDefault extends Weapon
{
    public StandDefault(int life)
    {
        super(life, 25);

    }
    
    public boolean parry()
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 85)
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
        array.add("Your stand's hp is: " + this.getLife());
        array.add("Your stand's attack power is: " + this.getAttackValue());
        return array;
    }

    public int attack(){
        return this.getAttackValue();
    }
}