package oren;



/**This is the All Meats combination addon object. 
 * 
 * @author odmil
 *
 */
public class AllMeats extends Addons {
	Double Price = 23.00;//Example price for a side
	
	/**The addons will call super to the Addons(mi) constructor to maintain status as decorators
	 */
	public AllMeats(MenuItem mi) {
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
