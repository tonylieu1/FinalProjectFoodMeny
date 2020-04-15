package rick;
public class Chicken implements FoodCost
{
    public Chicken()
    {
    }
    public double fc()
    {
        return 3.00;
    }
    public void food()
    {
        System.out.println("Add Chicken");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
