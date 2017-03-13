/**
 * Abstract class Weapon - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    private int damage;
    int life;
    private int dur;
    private int atk;
    public Weapon(int life1, int dmg)
    {
        super();
        life=life1;
        damage=dmg;
    }

    public int getLife()
    {
        return life;
    }
    
    public void takeDamage(int dmg)
    {
        life-=dmg;
    }
    
    public int getAttackValue()
    {
        return damage;
    }
    
    public boolean parry(){
        return false;
    }
    
}