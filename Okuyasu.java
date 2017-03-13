
/**
 * Write a description of class Okuyasu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Okuyasu extends JoBros
{
    int damage;
    int hp;
    public Okuyasu(int hp)
    {
        super(1700);//sends hp to the JoBros class
        damage=250;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Okuyasu has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        System.out.println("Let's go!! THE HAND!!!!!");
        target.takeDamage(damage);

    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public void raiseAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(60);
    }

    public void theHand(Enemy target)
    {
        int num = (int)(Math.random()*100+1);
        if(num>=90)
        {
            target.takeDamage(target.getHitpoints()/2);
        }
        else
        {
            hp-=100;
        }
    }
}
