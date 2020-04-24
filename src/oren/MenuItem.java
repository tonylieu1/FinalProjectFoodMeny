package oren;


/**Second iteration of MenuItem decorator group for the final project of Object Oriented Design
 * This is intended to be used to handle topping prices for the menu GUI and subsystems.
 * When utilized, it adds the prices of a base meal and its items together in a way that
 *     returns only the total price of the item as a double. 
 * 
 * @author odmil
 *
 */
public interface MenuItem {
    
    public Double givePrice();
    
}