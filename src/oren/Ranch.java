package oren;



/**This is the Ranch addon object. 
 * 
 * @author odmil
 *
 */
public class Ranch extends Addons {
	Double Price = 0.50;//Example price for a side
	
	/**The addons will call super to the Addons(mi) constructor to maintain status as decorators
	 */
	public Ranch(MenuItem mi) {
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
