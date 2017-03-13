
/**
 * Write a description of class RedHotChiliPepper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedHotChiliPepper extends Villains
{
    int damage;
    int hp;
    public RedHotChiliPepper(int hitpoints, int attack)
    {
        super(2000, 150);
        damage = 150;
        hp=2000;
    }

    public void takeDamage(int dmg)
    {
        if (this.getHitpoints()>0)
        {
            System.out.println("How can I be hurt!");
            super.takeDamage(dmg);
            System.out.println("Red Hot Chili Pepper's remaining health is: " + this.getHitpoints());
        }
        else
        {
            System.out.println("Red Hot Chili Pepper is dead:" + super.isDead());
        }
    }

    public void attack(Enemy target)
    {
        target.takeDamage(damage);
    }

    public void electricPowwa(int dmg)
    {
        if (this.getHitpoints()<=500)
        {
            damage+=dmg;
            hp-=2*dmg;
        }
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
}
