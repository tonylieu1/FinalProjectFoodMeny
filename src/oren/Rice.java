package oren;



/**This is the Rice addon object. 
 * 
 * @author odmil
 *
 */
public class Rice extends Addons {
	Double Price = 2.00;//Example price for a side
	
	/**The addons will call super to the Addons(mi) constructor to maintain status as decorators
	 */
	public Rice(MenuItem mi) {
		super(mi);
	}
	
	/**The givePrice of an addon decorator will call the super givePrice(), 
	 * 	then add its own value to a return total.
	 * 
	 */
	@Override
	public Double givePrice() {
		Double aggregatedPrice = Price + super.givePrice();
		return aggregatedPrice;
	}
}
