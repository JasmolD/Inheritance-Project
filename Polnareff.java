
/**
 * Write a description of class Polnareff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polnareff extends JoBros
{
    int damage;
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
        target.takeDamage(250);
    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public void raiseAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(50);
    }
}
