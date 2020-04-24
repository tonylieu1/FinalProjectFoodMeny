package Rick;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
public class Order//Main mehtod to make orders. 
{
    public static void main(String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException
    {
        FoodFactory ff = FoodFactory.getFactory();
        String food;
        
        System.out.println("Would you like to place an order ");
        Scanner input = new Scanner(System.in);
        food=input.next();
        ff.setFood(food);
        System.out.println(ff.fc());
//        while(food.equals("yes") || food.equals("Yes"))
//        {
//            System.out.println("What would you like to add to your order");
//            food=input.next();
//            ff.setFood(food);
//            
//         
//            System.out.println("Would you like to add anything else yes or no ");
//            boolean correctAnswer=false;
//            while(correctAnswer==false)
//            {
//                food=input.next();
//                if(food.equals("yes")||food.equals("Yes")||food.equals("no")||food.equals("No"))
//                {
//                    correctAnswer=true;
//                }
//                else
//                {
//                    System.out.println("Sorry I asked if you wanted to add more, yes or no");
//                }
//            }
//        }
//        System.out.println("Thank you and have a nice day"+ ff.fc());
    }
}
