
/**
 * Write a description of class KillerQueen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KillerQueen extends Character
{
    int hitpoints;
    int dmg;
    KiraYoshikage owner;
    Weapon weapon;
    public KillerQueen(KiraYoshikage owner, Weapon wpn)
    {
        super(1);
        this.owner = owner;
        weapon = wpn;
    }

    public void takeDamage(int hp){
        owner.takeDamage(hp);
    }
    
    public void raiseHealth(Villains target, int hp)
    {
        target.gainHealth(hp);
    }
    
    public void SheerHeartAttack(Villains target)
    {
        int num = (int)(Math.random()*100+1);
        if (num >= 65)
        {
            target.gainHealth(250);
        }
        else
        {
            System.out.println("Sheer Heart Attack has failed");
            target.gainHealth(-100);
        }
    }
    
    public void attack(Character target)
    {
        target.takeDamage(weapon.getAttackValue());
    }
}
