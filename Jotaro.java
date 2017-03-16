
/**
 * Write a description of class Jotaro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Jotaro extends JojoStandUsers
{
    int damage;
    public Jotaro(int hp, int atk)
    {
        super(hp, 100);//sends hp to the JoJo class
        damage = atk;
        damage=100;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("The enemy is hurt, they give you a menacing glance");
        super.takeDamage(dmg);
        System.out.println("Za enemy's remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Star Platinum");
        System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
        target.takeDamage(damage);
    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public int getAttackValue()
    {
        return damage;
    }

    public void theWorld(Enemy target, ZaStand target2)
    {
        System.out.println("Time has stopped, it will last for 6 seconds");
        for (int i=0; i< 6; i++)
        {
            int num = (int)(Math.random()*10+1);
            if(num>=8 && num<=10)
            {
                System.out.println("Go Star Platinum");
                target.takeDamage(target2.getDmg());
                System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
                System.out.println("In second " + i + " you deal " + target2.getDmg() + "damage.");
                System.out.println("The enemy's remaning health is: " + target.getHitpoints());
            }
            else if(num>=4 && num<=7)
            {
                System.out.println("Go Star Platinum");
                target.takeDamage(target2.getDmg()/2);
                System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
                System.out.println("In second " + i + " you deal " + target2.getDmg()/2 + "damage.");
                System.out.println("The enemy's remaning health is: " + target.getHitpoints());
            }
            else if(num>1 && num<4)
            {
                System.out.println("Go Star Platinum");
                target.takeDamage(target2.getDmg()/3);
                System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
                System.out.println("In second " + i + " you deal " + target2.getDmg()/3 + "damage.");
                System.out.println("The enemy's remaning health is: " + target.getHitpoints());
            }
            else
            {
                System.out.println("Go Star Platinum");
                target.takeDamage(target2.getDmg()/4);
                System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
                System.out.println("In second " + i + " you deal " + target2.getDmg()/4 + "damage.");
                System.out.println("The enemy's remaning health is: " + target.getHitpoints());
            }
            System.out.println("A second has passed." + (6- i) + " seconds remain until time resumes." );
        }
        System.out.println("Time has resumed.");
    }
}
