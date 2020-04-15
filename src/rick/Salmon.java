package rick;
public class Salmon implements FoodCost
{
    public Salmon()
    {
    }
    public double fc()
    {
        return 5.00;
    }
    public void food()
    {
        System.out.println("Add Salmon");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
