
/**
 * Write a description of class Josepj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Joseph extends JoJo
{
    int damage;
    public Joseph(int hp, int atk)
    {
        super(2500, 225);//sends hp to the JoJo class
        damage = atk;
        damage = 225;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Joseph has been hurt.");
        super.takeDamage(dmg);
        System.out.println("Joseph remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Hamon");
        target.takeDamage(250);
    }
    
    public int getAttackValue()
    {
        return damage;
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
}
