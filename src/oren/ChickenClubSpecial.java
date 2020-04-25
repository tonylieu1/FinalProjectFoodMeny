package oren;



/**This is the Chicken Club and Fries special
 * 
 * @author odmil
 * 
 */
public class ChickenClubSpecial implements MenuItem {
	Double Price = 10.0000; 
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public ChickenClubSpecial() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		return Price;
	}
}