
/**
 * Write a description of class JoBros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class JoBros extends ArakiNoJishin
{
    public JoBros(int hp)
    {
        super(hp);
    }
    
    public void raiseAttack(JojoStandUsers target, int atk)
    {
        target.gainAttack(atk);
    }
    
    public void raiseHealth(ArakiNoJishin target, int hp)
    {
        target.gainHealth(hp);
    }
}
