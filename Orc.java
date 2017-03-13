
/**
 * Write a description of class Orc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orc extends Enemy
{
    int damage;
    int hp;
    public Orc(int hitpoints, int dmg)
    {
        super(hitpoints);//sends hp to the enemy class
        damage = dmg;
        hp=hitpoints;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("The Orc cries OW!!'");
        super.takeDamage(dmg);
        System.out.println("The Orc's remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        target.takeDamage(damage);
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void lowIQ()
    {
        damage=+10;
        hp-=10;
    }
}
