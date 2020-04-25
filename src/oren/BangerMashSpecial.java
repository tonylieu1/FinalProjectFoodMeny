package oren;



/**This is the Banger and Mash special
 * 
 * @author odmil
 * 
 */
public class BangerMashSpecial implements MenuItem {
	Double Price = 16.0000; 
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public BangerMashSpecial() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		return Price;
	}
}