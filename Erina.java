
/**
 * Write a description of class Erina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Erina extends JoBros
{
    int damage;
    public Erina(int hp)
    {
        super(hp);//sends hp to the JoBros class
        //damage = dmg;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Erina has been hurt.");
        super.takeDamage(dmg);
        System.out.println("Her remaining health is: " + this.getHitpoints());
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void firstLove(JoJo target, int atk)
    {
        target.gainAttack(100);
        target.gainHealth(200);
    }
    
}
