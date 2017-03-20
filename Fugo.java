
/**
 * Write a description of class Fugo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fugo extends JoBros
{
    int damage;
    public Fugo(int hp)
    {
        super(hp);//sends hp to the JoBros class
        damage = 200;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Fugo has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        System.out.println("Go Purple Haze!!");
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
    
    public void purpleHazePoison(Enemy target)
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 95)
        {
            System.out.println("Purple haze has activated his poison");
            target.takeDamage(damage*4);
            System.out.println("The enemy's remaning health is: " + target.getHitpoints());
            System.out.println("Purple Haze's poison continues to injure the energy");
            target.takeDamage(damage*2);
            System.out.println("The enemy's remaning health is: " + target.getHitpoints());
            System.out.println("The poison has ended");
        }
        else
        {
            System.out.println("Purple haze will not come out.");
        }
    }
}
