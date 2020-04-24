package oren;


/**This is an example of a Addon object. 
 * Actual addons will replace 'Side' and have their own Price values.
 * 
 * @author odmil
 *
 */
public class Side extends Addons {
    Double Price = 0.300;//Example price for a side
    
    /**The addons will call super to the Addons(mi) constructor to maintain status as decorators
     */
    public Side(MenuItem mi) {
        super(mi);
    }
    
    /**The givePrice of an addon decorator will call the super givePrice(), 
     *     then add its own value to a return total.
     * 
     */
    @Override
    public Double givePrice() {
        Double aggregatedPrice = Price + super.givePrice();
        return aggregatedPrice;
    }
}