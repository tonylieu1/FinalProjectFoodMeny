package rick;

public class BlueCheese implements FoodCost
{
    public BlueCheese()
    {
    }
    public double fc()
    {
        return 0.50;
    }
    public void food()
    {
        System.out.println("Add blue cheese");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
