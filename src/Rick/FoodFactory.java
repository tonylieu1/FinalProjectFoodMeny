
package Rick;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
public class FoodFactory//Class to make classes for orders
{
    static FoodFactory ff;
    Double cost;
    FoodCost foodcost;
    public FoodFactory()//sets initial property to beef
    {
        System.setProperty("FoodandCost","Beef");
        cost=0.00;
    }
    public void setFood(String food) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException//sets new property to what ever is being added to order
    {  System.setProperty("FoodandCost", food);
       // try//in case user enters the something not on the menu
       // {
          
          //  String fee= System.getProperty("FoodandCost");
           // foodcost=(FoodCost) Class.forName(fee).getConstructor().newInstance();
           // this.totalFoodCost(foodcost.fc());
          //  System.out.println(foodcost.food() + " and the price of " + foodcost.fc() + " to total up to " + this.getTotalCost());
       // }
        //catch(Exception ClassNotFoundException)
       // {
            System.out.println("Sorry that food item isn't on the menu");
        //}
    }
    private double getTotalCost()//gets the total cost of the order
    {
        return cost;
    }
    private double totalFoodCost(double fc)//adds up all of the food costs into one total food cost
    {
        cost += fc;
        return cost;
    }
    public static FoodFactory getFactory()//the method to make a new order happen.
    {
        ff=new FoodFactory();
        return ff;
    }
    public double fc() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	String s = System.getProperty("FoodandCost");
    	foodcost = (FoodCost) Class.forName(s).newInstance();
		return foodcost.fc();
    	
    }
}
