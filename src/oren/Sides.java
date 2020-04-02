package oren;
import java.util.ArrayList;
import java.util.List;

public class Sides implements MenuObject {
    protected MenuObject selection;
    
    public Sides(MenuObject m) {
        this.selection = m;
    }
    
    @Override
    public void printList() {
        this.selection.printList();
    }

}