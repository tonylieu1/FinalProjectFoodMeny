package rick;
public class Rice implements FoodCost
{
    public Rice()
    {
    }
    public double fc()
    {
        return 2.00;
    }
    public void food()
    {
        System.out.println("Add Rice");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
