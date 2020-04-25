package oren;



/**This is the Salmon and Vegetable medley special
 * 
 * @author odmil
 * 
 */
public class SalmonSpecial implements MenuItem {
	Double Price = 14.0000; 
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public SalmonSpecial() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		return Price;
	}
}