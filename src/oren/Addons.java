package oren;
/**This is the Addons parent object, provides structure for decorator attachment.
 * 
 * @author odmil
 * 
 */
public class Addons implements MenuItem{
    protected MenuItem prev;
    //prev stores wrapped MenuItem object
    
    /**Addon constructor adds new MenuItem to prev.
     * Called by all addons in their constructors.
     */
    public Addons(MenuItem mi) {
        this.prev = mi;
    }
    
    /**an addon's givePrice will add the price of the addon to 
     *     the price of all objects wrapped by calling the super.
     * 
     */
    @Override
    public Double givePrice() {
        //addon objects will need to add their value to a super call.
        return this.prev.givePrice();
    }
}