
/**
 * Write a description of class JoJo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class JoJo extends ArakiNoJishin
{
    int atk;
    public JoJo(int hp, int attack)
    {
        super(hp);
        atk=attack;
    }
    
    public int getAttackValue()
    {
        return atk;
    }
    
        public void gainAttack(int atk) {
        damage += atk;
    }
}
