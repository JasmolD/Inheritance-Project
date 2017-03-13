
/**
 * Write a description of class Shield here.
 * 
 * @author (Jasmol Dhesi) 
 * @version (3.7.17)
 */
public class Defense extends Character
{
    Character owner;
    Defenders defender;
    public Defense(Character owner, Defenders def)
    {
        super(100);
        this.owner = owner;
        defender=def;
    }
}