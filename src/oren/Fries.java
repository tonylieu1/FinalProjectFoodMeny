package oren;
public class Fries extends Sides {

    @SuppressWarnings("static-access")
    public Fries(MenuObject m) {
        super(m);
        m.Names.add("+Fries");
        double sp = 2.50;
        m.Price.add(sp);
    }
}