
/**
 * Write a description of class Giorno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Giorno extends JojoStandUsers
{
    int damage;
    public Giorno(int hp, int atk)
    {
        super(hp, 100);//sends hp to the JoJo class
        damage = atk;
        damage=80;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("The enemy is hurt, they give you a menacing glance");
        super.takeDamage(dmg);
        System.out.println("Za enemy's remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {        
        System.out.println("Go Gold Experience");
        System.out.println("MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDA-MUDAAAAAAAAAAA!!!!!!");
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
    
    public void theAbilityToGiveLife(ArakiNoJishin target)
    {
        int num = (int)(Math.random()*100+1);
        target.gainHealth(num + 50);
        System.out.println("Gorno has healed his ally for ." + num + "health.");
        System.out.println("They now have " + target.getHitpoints() + "health.");
    }
}

