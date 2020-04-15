package rick;

public class Fruit implements FoodCost
{
    public Fruit()
    {
    }
    public double fc()
    {
        return 3.00;
    }
    public void food()
    {
        System.out.println("Add friut");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}

