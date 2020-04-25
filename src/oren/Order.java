package oren;



/**This is the base object, provides base for decorator attachment.
 * Words "Order" and prices will be adjusted for new meals.
 * This also serves as a "Base Object" for single servings of addon items without a "Specials" order
 * 
 * @author odmil
 * 
 */
public class Order implements MenuItem {
	Double Price = 0.0; //Example price
	
	/**Order constructors are empty, they only have to exist for structure.
	 */
	public Order() {}
	
	
	/**The givePrice method will repeat in every object.
	 * It will call backwards through wrapped addons, 
	 * 	final return is a total of the price for base order plus all addons.
	 */
	@Override
	public Double givePrice() {
		//Order-style base objects will only have a return call here.
		//Addon objects will need to add their value to a super call.
		return Price;
	}
}