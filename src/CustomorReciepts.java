import java.util.ArrayList;
//each consturt will contain both the price and food item sepertally 
public class CustomorReciepts {
	ArrayList<Double> Prices = new ArrayList();
	ArrayList<String> FoodItems = new ArrayList();
	public CustomorReciepts() {
		
	}
	public void addfood(String food) {
		FoodItems.add(food);
	}
	public void addPrice(double price) {
		Prices.add(price);
	}
}
