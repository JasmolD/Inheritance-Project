
/**
 * Write a description of class JoJo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ArakiNoJishin extends Character
{
    public ArakiNoJishin(int hp)
    {
       super(hp);
    }
    
    public void gainHealth(int hp) {
        hitpoints += hp;
    }
}
