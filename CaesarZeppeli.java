
/**
 * Write a description of class CeaserZeppeli here.
 * Bubble cutter
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesarZeppeli extends JoBros
{
    int damage;
    int hp;
    public CaesarZeppeli(int hitpoints)
    {
        super(hitpoints);//sends hp to the JoBros class
        hp= hitpoints;
        hp=2000;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Caesar has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        System.out.println("Bubble Cutter!!!");
        target.takeDamage(200);
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void raiseAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(atk);
    }
    
    public void lastHamon(JoJo target)
    {
        if(this.getHitpoints()>200)
        {
            System.out.println("Caesar is still able to fight.");
        }
        else
        {
            target.gainHealth(500);
            target.gainAttack(250);
            hp=0;
            System.out.println("Caesar has given you the last of his life energy, he shall now go onto a better place.");
            System.out.println("Caesar is dead:" + super.isDead());
        }
    }
}
