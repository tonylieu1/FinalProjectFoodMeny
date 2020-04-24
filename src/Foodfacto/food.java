package Foodfacto;

public class food {
	public static void main(String[]args)throws InstantiationException,IllegalAccessException, ClassNotFoundException{
		FoodFacto fo = FoodFacto.getFood();
		String food = "Beef";
		fo.setCompany(food);
		System.out.println("Price:"+fo.getFoodPrice());
	}
}
