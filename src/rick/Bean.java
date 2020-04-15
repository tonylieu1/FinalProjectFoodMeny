package rick;
public class Bean implements FoodCost
{
    public Bean()
    {
    }
    public double fc()
    {
        return 1.00;
    }
    public void food()
    {
        System.out.println("Add Bean");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
