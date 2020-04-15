package rick;

public class Tuna implements FoodCost
{
    public Tuna()
    {
    }
    public double fc()
    {
        return 6.00;
    }
    public void food()
    {
        System.out.println("Add Tuna");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}

