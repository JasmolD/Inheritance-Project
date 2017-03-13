
/**
 * Write a description of class Kars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kars extends Villains
{
    int damage;
    public Kars()
    {
        super(2500,150);
        damage=150;
    }

    public void takeDamage(int dmg)
    {
        if (this.getHitpoints()>0)
        {
            System.out.println("How could I an Immortal Aztec God be hurt!");
            super.takeDamage(dmg);
            System.out.println("Kars' remaining health is: " + this.getHitpoints());
        }
        else
        {
            System.out.println("Kars is dead:" + super.isDead());
        }
    }

    public void attack(Enemy target)
    {
        target.takeDamage(damage);
    }

    public void raiseHealth(Kars target, int hp)
    {
        target.gainHealth(100);
    }

    public void ImmortalBody(ArakiNoJishin target, int hp)
    {
        target.takeDamage(hp);
        this.gainHealth(hp);
    }

    public int getLife()
    {
        return this.getHitpoints();
    }
}
