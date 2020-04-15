package rick;
public class Shrimp implements FoodCost
{
    public Shrimp()
    {
    }
    public double fc()
    {
        return 6.00;
    }
    public void food()
    {
        System.out.println("Add Shrimp");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
