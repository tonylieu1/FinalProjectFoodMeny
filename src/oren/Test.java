package oren;
/**
 * This class is a test of the example object, it shows the system and how it works
 * @author Oren Millson
 *
 */
public class Test {

    public static void main(String[] args) {
        MenuObject e = new ExampleItem();
        
        e.printList();//prints base exampleitem
        
        e = new Fries(e);
        
        e.printList();//prints exampleitem with fries

        /*These lines created a conflict within the calling - MenuObject g was contaminated with MenuObject e's contents - will seek to solve later
         * 
         * MenuObject g = new ExampleItem2();
         * g.printList();
        */
    }

}