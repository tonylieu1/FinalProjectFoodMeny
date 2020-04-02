package oren;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the first iteration of the MenuObject interface
 * @author Oren Millson
 *
 */
public interface MenuObject {
    List<Double> Price = new ArrayList<Double>();//Price acts as a direct Arraylist of prices, matched by position to...
    List<String> Names = new ArrayList<String>();//Names acts as a direct Arraylist of item names
    
    public void printList();

}