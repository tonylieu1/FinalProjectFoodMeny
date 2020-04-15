package rick;

public class Fries implements FoodCost
{
    public Fries()
    {
    }
    public double fc()
    {
        return 1.00;
    }
    public void food()
    {
        System.out.println("Add Fries");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
