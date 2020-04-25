package oren;



/**This is the Steak and Mashed Potatoes special
 * 
 * @author odmil
 * 
 */
public class SteakSpecial implements MenuItem {
	Double Price = 20.0000; 
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public SteakSpecial() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		return Price;
	}
}