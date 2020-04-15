package rick;

public class Ranch implements FoodCost
{
    public Ranch()
    {
    }
    public double fc()
    {
        return 0.50;
    }
    public void food()
    {
        System.out.println("Add ranch");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
