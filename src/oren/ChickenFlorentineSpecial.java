package oren;



/**This is the Chicken Florentine and Mash Potatoes special
 * 
 * @author odmil
 * 
 */
public class ChickenFlorentineSpecial implements MenuItem {
	Double Price = 9.0000; 
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public ChickenFlorentineSpecial() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		return Price;
	}
}