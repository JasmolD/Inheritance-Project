
/**
 * Abstract class Defenders - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Defenders extends Item implements DefenseCommands
{
    private int damage;
    int life;
    private int dur;
    public Defenders(int life1, int def)
    {
        super();
        life=life1;
        dur=def;
    }

    public int getLife()
    {
        return life;
    }
    
    public void takeDamage(int dmg)
    {
        life-=dmg;
    }
    
    public int getDefenseValue()
    {
        return damage;
    }
    
    public boolean blocked(){
        return false;
    }
    
}
