package rick;

public class OnionRings implements FoodCost
{
    public OnionRings()
    {
    }
    public double fc()
    {
        return 2.00;
    }
    public void food()
    {
        System.out.println("Add Onion Rings");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
