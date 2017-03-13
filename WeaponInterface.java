
/**
 * Methods for all weapons
 * 
 * @author Wiebe 
 * @version 1.2
 */
public interface WeaponInterface
{
    /**
     * Attacks an enemy for an amount
     * 
     * 
     * @return        Returns amount of damage successfully done to the opponent 
     */
    int attack();
    /**
     * Parry Attack Method
     * 
     * @return        True if the attack was parried. 
     */
    boolean parry();
    
}
