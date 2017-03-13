
/**
 * Write a description of class KiraYoshikage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KiraYoshikage extends Villains{
    int damage;
    public KiraYoshikage(int hp, int atk)
    {
        super(hp, 0);
    }
    
    public void takeDamage(int dmg)
    {
        System.out.println("How could I Kira Yoshikage be hurt!");
        super.takeDamage(dmg);
        System.out.println("Kira's remaining health is: " + this.getHitpoints());
    }

    public void attack(Enemy target)
    {
        target.takeDamage(damage);
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
}
