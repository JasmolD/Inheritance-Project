
/**
 * Write a description of class SpeedWagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class SpeedWagon extends JoBros
{
    int damage;
    public SpeedWagon(int hp)
    {
        super(hp);//sends hp to the JoBros class
        //damage = dmg;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Kakyoin has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        System.out.println("Go Heirophant Green!!");
        target.takeDamage(damage);

    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public void raiseHealth(ArakiNoJishin target, int hp)
    {
        target.gainHealth(hp);
    }

    public void allyForever(JoJo target, int hp)
    {
        int num = (int)(Math.random()*100+1);
        if(target.getHitpoints()>=1500)
        {
            if(num>=90)
            {
                target.gainHealth(target.getHitpoints()*(3/2));
                System.out.println("Speedwagon's ties to the Joestars allowed him to help out once again.");
            }
            else
            {
                hp-=100;
                System.out.println("Speedwagon's ties to the Joestars weren't strong enough.");
            }
        }
        else
        {
            if(num>=90)
            {
                target.gainHealth((target.getHitpoints()*(3/2))+1000);
            }
            else
            {
                hp-=100;
                System.out.println("Speedwagon's ties to the Joestars weren't strong enough.");
            }
        }
    }
}
