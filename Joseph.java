
/**
 * Write a description of class Josepj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Joseph extends JoJo
{
    int damage;
    int hitpoints;
    public Joseph(int hp, int atk)
    {
        super(hp, 225);//sends hp to the JoJo class
        damage = atk;
        damage = 225;
        hitpoints = hp;
        hitpoints = 2500;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Joseph has been hurt.");
        super.takeDamage(dmg);
        System.out.println("Joseph's remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Hamon");
        target.takeDamage(250);
    }
    
    public int getAttackValue()
    {
        return damage;
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void hamonClackers()
    {
        int num = (int)(Math.random()*10+1);
        for (int i=0; i<num; i++)
        {
            if(num>=7)
            {
                damage+=150;
                System.out.println("Joseph spins the clackers " + num + " times.");
                System.out.println("His attack is now: " + damage);
                System.out.println("Oh my GODDDDD!!!");
            }
            else if (num<7 && num>=4)
            {
                damage-=150;
                System.out.println("Joseph spins the clackers " + num + " times.");
                System.out.println("Joseph couldn't control the hamon over the clackers and the clackers go wild");
                System.out.println("His attack is now: " + damage);
                System.out.println("OHHH NOOOOOOOOO!!!");
            }
            else
            {
                damage+=100;
                System.out.println("Joseph spins the clackers " + num + " times.");
                System.out.println("His attack is now: " + damage);
                System.out.println("Oh my GODDDDD!!!");
            }
        }
        
    }
}