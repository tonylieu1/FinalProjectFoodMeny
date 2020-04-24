

public class FoodFacto {
static FoodFacto fod;
	FoodStuff foodStuff;
	
	private FoodFacto() {
		System.setProperty("FoodFrom", "FromBeef");
	}
	public void setCompany(String comp) {
		System.setProperty("FoodFrom", "From"+ comp);
	}
	public double getFoodPrice()throws InstantiationException,IllegalAccessException,ClassNotFoundException{
		String f = System.getProperty("FoodFrom");
		foodStuff = (FoodStuff) Class.forName(f).newInstance();
		return foodStuff.getFoodPrice();
	}
	public static FoodFacto getFood() {
		if(fod == null) {
			fod = new FoodFacto();
		}
		return fod;
		
	}
}
