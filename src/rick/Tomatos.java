package rick;

public class Tomatos implements FoodCost
{
    public Tomatos()
    {
    }
    public double fc()
    {
        return 1.00;
    }
    public void food()
    {
        System.out.println("Add Tomatos");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
