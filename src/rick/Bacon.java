package rick;

public class Bacon implements FoodCost
{
    public Bacon()
    {
    }
    public double fc()
    {
        return 1.00;
    }
    public void food()
    {
        System.out.println("Add Bacon");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
