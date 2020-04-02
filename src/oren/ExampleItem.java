package oren;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is an example object, it shows the decorator system and how it works
 * This format of object will be the "base item" that decorators will be added onto as sides or modifications
 * @author Oren Millson
 *
 */
public class ExampleItem implements MenuObject {
    
    public ExampleItem() {
        Names.add("Example_Name");//Example_Name is added to the names list as a new entry 
        double b = 5.99;
        Price.add(b);//Example Price (5.99) is added to the price list as a new entry
    }
    
    @Override
    public void printList() {//simple printer, receipt fashion
        for (int i = 0; i< Names.size(); i++) {    //iterates through both (same length) lists, printing as "Name............$price 
            System.out.print(Names.get(i));
            System.out.print("............");
            double d = Price.get(i);
            System.out.printf("$%2.2f\n",d);
        }
    }

}