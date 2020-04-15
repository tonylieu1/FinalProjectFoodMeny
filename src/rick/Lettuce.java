package rick;

public class Lettuce implements FoodCost
{
    public Lettuce()
    {
    }
    public double fc()
    {
        return 1.00;
    }
    public void food()
    {
        System.out.println("Add Lettuce");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
