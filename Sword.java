
/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.ArrayList;
public class Sword extends Weapon{
    public Sword(int life)
    {
        super(life, 50);
    }
    
    public boolean parry()
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

    public ArrayList<Object> getStats(){
        ArrayList<Object> array = new ArrayList<Object>();
        array.add("Your sword's hp is: " + this.getLife());
        array.add("Your sword's attack power is: " + this.getAttackValue());
        array.add("Your sword is usable:" + this.isBroken());
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
        this.takeDamage(8);
        return this.getAttackValue();
    }
}
