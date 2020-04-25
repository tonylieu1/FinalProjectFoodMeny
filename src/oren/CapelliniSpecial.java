package oren;



/**This is the Shrimp Capellini special
 * 
 * @author odmil
 * 
 */
public class CapelliniSpecial implements MenuItem {
	Double Price = 18.0000; 
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public CapelliniSpecial() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		return Price;
	}
}