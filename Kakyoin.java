
/**
 * Write a description of class Kakyoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kakyoin extends JoBros
{
    int damage;
    public Kakyoin(int hp)
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
        target.takeDamage(222);
        
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void raiseAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(60);
    }
    
}
