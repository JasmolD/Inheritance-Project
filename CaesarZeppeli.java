
/**
 * Write a description of class CeaserZeppeli here.
 * Bubble cutter
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesarZeppeli extends JoBros
{
    int damage;
    public CaesarZeppeli(int hp)
    {
        super(hp);//sends hp to the JoBros class
        //damage = dmg;
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
    
}
