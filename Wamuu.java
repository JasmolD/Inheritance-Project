
/**
 * Write a description of class Wamuu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Wamuu extends Villains
{
    int damage;
    public Wamuu(int hp, int atk)
    {
        super(2000, 125);
        damage= 125;
    }

    public void takeDamage(int dmg)
    {
        if (this.getHitpoints()>0)
        {
            System.out.println("How could I an Aztec God of Exercising be hurt!");
            super.takeDamage(dmg);
            System.out.println("Wamuu's remaining health is: " + this.getHitpoints());
        }
        else
        {
            System.out.println("Wamuu is dead:" + super.isDead());
        }        
    }

    public void attack(Enemy target)
    {
        target.takeDamage(125);
    }

    public void raiseHealth(Wamuu target, int hp)
    {
        target.gainHealth(100);
    }

    public void warriorsPride(Wamuu target)
    {
        int num = (int)(Math.random()*100+1);
        if(this.getHitpoints()<=200)
        {
            if(num>=77)
            {
                target.gainAttack(80);
            }
            else
            {
                target.gainAttack(-10);
                System.out.println("Wamuu was wounded by his pride.");
            }
        }
        else
        {
            System.out.println("Wamuu's warrior pride isn't strong enough to unleash his true potential.");
        }
    }

    public int getLife()
    {
        return this.getHitpoints();
    }
}
