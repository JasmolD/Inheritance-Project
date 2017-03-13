
/**
 * Write a description of class SpeedWagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedWagon extends JoBros
{
    int damage;
    public SpeedWagon(int hp)
    {
        super(hp);//sends hp to the JoBros class
        //damage = dmg;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Kakyoin has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        System.out.println("Go Heirophant Green!!");
        target.takeDamage(damage);
        
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void raiseHealth(ArakiNoJishin target, int hp)
    {
        target.gainHealth(hp);
    }
}
