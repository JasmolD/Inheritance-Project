
/**
 * Write a description of class MisaMisa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LisaLisa extends JoBros
{
    int damage;
    public LisaLisa(int hp)
    {
        super(hp);//sends hp to the JoBros class
        //damage = dmg;
    }

    public void takeDamage(int dmg)
    {
        System.out.println("Lisa Lisa has been hurt.");
        super.takeDamage(dmg);
        System.out.println("Her remaining health is: " + this.getHitpoints());
    }
    
    public int getLife()
    {
        return this.getHitpoints();
    }
    
    public void attack(Enemy target)
    {
        System.out.println("Snake Muffler!!!");
        target.takeDamage(230);
    }
    
    public void familyBonds(JoJo target, int atk)
    {
        target.gainAttack(150);
        target.gainHealth(250);
    }
}
