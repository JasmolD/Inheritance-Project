
/**
 * Write a description of class Dio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Dio extends Villains
{
    int damage;
    public Dio()
    {
        super(1000, 50);
        damage=50;
    }

    public void takeDamage(int dmg)
    {
        if (this.getHitpoints()>0)
        {
            System.out.println("How could I Dio Brando be hurt!");
            super.takeDamage(dmg);
            System.out.println("Dio's remaining health is: " + this.getHitpoints());
        }
        else
        {
            System.out.println("Dio is dead:" + super.isDead());
        }
    }
    
    public void attack(Enemy target)
    {
        target.takeDamage(damage);
    }

    public void siblingRivalry(Jonathan target)
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 60)
        {
            target.gainAttack(-20);
            System.out.print("Dio's ploy has damaged Jonathan's bonds with his father.");
        }
        else
        {
            System.out.print("Jonathan's bonds were too strong.");
        }
    }

    public int getLife()
    {
        return this.getHitpoints();
    }
}
