
/**
 * Write a description of class MisaMisa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LisaLisa extends JoBros
{
    int damage;
    int hp;
    public LisaLisa(int hitpoints)
    {
        super(hitpoints);//sends hp to the JoBros class
        hp = hitpoints;
        hp = 2100;
        damage= 230;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Lisa Lisa has been hurt.");
        super.takeDamage(dmg);
        System.out.println("Her remaining health is: " + this.getHitpoints());
    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public void attack(Enemy target)
    {
        System.out.println("Snake Muffler!!!");
        target.takeDamage(damage);
    }

    public void familyBonds(JoJo target, int atk)
    {
        if(this.getHitpoints()>300)
        {
            target.gainAttack(100);
            target.gainHealth(200);
            hp-=150;
            damage-=20;
        }
        else
        {
            System.out.println("Lisa Lisa isn't able to expendany further energy.");
        }
    }
}
