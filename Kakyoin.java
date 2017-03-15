
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
        damage = 222;
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
    
    public void raiseAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(60);
    }
    
    public void emeraldSplash(Enemy target)
    {
        int num = (int)(Math.random()*10+1);
        for (int i=0; i< num/2; i++)
        {
            System.out.println("Hierophant Green uses emerald splash");
            target.takeDamage(damage/2);
            System.out.println("Hierophant Green unleashes another wave of emerald spash at the energy");
            System.out.println("The enemy's remaning health is: " + target.getHitpoints());
        }
        System.out.println("Emerald splash has ended");
    }
}
