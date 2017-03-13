
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Character
{
    int hitpoints;
    int damage;
    public Character(int hp)
    {
        hitpoints = hp;
    }

    public void takeDamage(int dmg)
    {
        hitpoints -= dmg; //hitpints = hitpoints- dmg
    }

    public int getHitpoints()
    {
        return hitpoints;
    }
    
    public void attack(Character target)
    {
        target.takeDamage(damage);
    }
    
    public boolean isDead()
    {
        if (hitpoints<=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
