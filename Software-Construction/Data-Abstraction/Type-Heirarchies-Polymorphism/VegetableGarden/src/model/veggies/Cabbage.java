package model.veggies;

import model.Vegetable;
import static model.VegType.*;

public class Cabbage extends Vegetable {
    public Cabbage() {
        super("Cabbage", LEAF);
        setInstructions("Sow ¼ inch deep 6 to 8 weeks before the last spring frost.");
    }

    @Override
    public void feed() {
        System.out.println("Fertilize 2 weeks after transplanting with a balanced (10-10-10) fertilizer.");
    }

    @Override
    public void water() {
        System.out.println("Water well, and keep the soil moist.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest when heads reach desired size and are firm.");
    }
}
