package rick;

public class HoneyMustard implements FoodCost
{
    public HoneyMustard()
    {
    }
    public double fc()
    {
        return 0.50;
    }
    public void food()
    {
        System.out.println("Add honey mustard");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}

