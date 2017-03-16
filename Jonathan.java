
/**
 * Write a description of class Jonathan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jonathan extends JoJo
{
    int damage;
    public Jonathan(int hp, int atk)
    {
        super(2222, 190);//sends hp to the JoJo class
        damage = atk;
        damage=190;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Jonathan has been hurt.");
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
    }

    public void attack(Character target)
    {
        System.out.println("Go Yellow Hamon OVERDRIVE!!!");
        System.out.println("Fwish");
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
    
    public void chivalrousNature(int dmg)
    {
        super.takeDamage(dmg);
        System.out.println("His remaining health is: " + this.getHitpoints());
        System.out.println("Jonathan takes the attack for himself, protecting his allies.");
    }
}
