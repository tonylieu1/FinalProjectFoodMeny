package rick;
public class FromBeef implements FoodCost
{
    public FromBeef()
    {
    }
    public double getfc()
    {
        return 3.00;
    }
    public void food()
    {
        System.out.println("Add Beef");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		String foodName = "Beef";
		return foodName;
	}
	@Override
	public double fc() {
		// TODO Auto-generated method stub
		return 0;
	}


}
