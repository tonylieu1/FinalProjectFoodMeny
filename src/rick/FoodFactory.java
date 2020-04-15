package rick;
public class FoodFactory
{
    static FoodFactory ff;
    Double cost;
    FoodCost FoodCost;
    public FoodFactory()
    {
        System.setProperty("FoodandCost","Beef");
        cost=0.00;
    }
    public void setFood(String food)
    {
        System.setProperty("FoodandCost", "From"+food);
    }
    public double fc() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	String s = System.getProperty("FoodandCost");
		FoodCost = (FoodCost) Class.forName(s).newInstance();
		
		return FoodCost.fc();
    	
    }
    public double totalFoodCost()
    {
        return cost;
    }
    public static FoodFactory getFactory()
    {
        ff=new FoodFactory();
        return ff;
    }
}


