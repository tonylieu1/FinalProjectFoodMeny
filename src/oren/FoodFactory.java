package oren;
public class FoodFactory
{
    static FoodFactory ff;
    Double cost;
    private FoodFactory()
    {
        System.setProperty("FoodandCost","Beef");
        cost=0.00;
    }
    public void setFood(String food)
    {
        System.setProperty("FoodandCost", food);
    }
    public double totalFoodCost()
    {
        return 0.00;
    }
    public static FoodFactory getFactory()
    {
        ff=new FoodFactory();
        return ff;
    }
}
