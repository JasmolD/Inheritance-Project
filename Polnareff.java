
/**
 * Write a description of class Polnareff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polnareff extends JoBros
{
    int damage = 250;
    public Polnareff(int hp)
    {
        super(hp);//sends hp to the JoBros class
        //damage = dmg;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Polnareff has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        System.out.println("Go Silver Chariot!!");
        target.takeDamage(damage);
    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public void raiseJojoAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(50);
    }
    
    public void lastShot(Enemy target)
    {
        if(this.getHitpoints()>200)
        {
            System.out.println("Polnareff doesn't need to resort to his last shot.");
        }
        else
        {
            target.takeDamage(damage*3);
            System.out.println("Polnareff has shot his sword and is no longer capable of attacking.");
            damage=0;
        }
    }
}
