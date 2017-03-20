
/**
 * Write a description of class ZaStand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZaStand extends ArakiNoJishin
{
    int hitpoints;
    int dmg;
    JojoStandUsers owner;
    Weapon weapon;
    public ZaStand(JojoStandUsers owner, Weapon wpn)
    {
        super(1);
        this.owner = owner;
        weapon = wpn;
        dmg= weapon.getAttackValue() + owner.getAttackValue();
    }

    public void takeDamage(int hp){
        owner.takeDamage(hp);
    }

    public void attack(Enemy target)
    {
        target.takeDamage(dmg);
        weapon.attack();
        weapon.getLife();
    }
    
    public int getDmg()
    {
        return dmg;
    }
    
    public void switchWeapon()
    {
        
    }
}
