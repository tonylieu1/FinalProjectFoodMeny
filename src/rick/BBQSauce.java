package rick;

public class BBQSauce implements FoodCost
{
    public BBQSauce()
    {
    }
    public double fc()
    {
        return 0.50;
    }
    public void food()
    {
        System.out.println("Add BBQ sauce");
    }
	@Override
	public String foodName() {
		// TODO Auto-generated method stub
		return null;
	}
}
