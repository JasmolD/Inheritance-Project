
/**
 * Abstract class Stands - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class EnemyStand extends Character
{
    int hitpoints;
    int dmg;
    Character owner;
    Weapon weapon;
    public EnemyStand(Character owner, Weapon wpn)
    {
        super(1);
        this.owner = owner;
        weapon = wpn;
    }
    public void takeDamage(int hp){
        owner.takeDamage(hp);
    }
}
