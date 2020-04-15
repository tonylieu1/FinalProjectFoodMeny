package rick;

public class GreenBeans implements FoodCost
{
    public GreenBeans()
    {
    }
    public double fc()
    {
        return 2.00;
    }
    public void food()
    {
        System.out.println("Add Green Beans");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
