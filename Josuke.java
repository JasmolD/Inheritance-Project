
/**
 * Write a description of class Josuke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Josuke extends JojoStandUsers
 {   // instance variables - replace the example below with your own
    int damage;
    public Josuke(int hp)
    {
        super(hp, 80);//sends hp to the JoJo class
        damage = atk;
        damage=80;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("You have been hurt.");
        super.takeDamage(dmg);
        System.out.println("Your remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Crazy Diamond");
        System.out.println("DO-RARARARARARARARARARARARARARARARARARA DORA");
        target.takeDamage(damage);
        
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
