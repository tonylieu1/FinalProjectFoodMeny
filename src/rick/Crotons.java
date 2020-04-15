package rick;

public class Crotons implements FoodCost
{
    public Crotons()
    {
    }
    public double fc()
    {
        return 0.50;
    }
    public void food()
    {
        System.out.println("Add Crotons");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
