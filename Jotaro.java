
/**
 * Write a description of class Jotaro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jotaro extends JojoStandUsers
{
    int damage;
    public Jotaro(int hp, int atk)
    {
        super(hp, 100);//sends hp to the JoJo class
        damage = atk;
        damage=100;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("The enemy is hurt, they give you a menacing glance");
        super.takeDamage(dmg);
        System.out.println("Za enemy's remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Star Platinum");
        System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
        target.takeDamage(damage);
    }

    public int getLife()
    {
        return this.getHitpoints();
    }

    public int getAttackValue()
    {
        return damage;
    }
    
    public void starPlatinum()
    {
        
        
        System.out.println("ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA-ORA!!!!!!");
    }
}
