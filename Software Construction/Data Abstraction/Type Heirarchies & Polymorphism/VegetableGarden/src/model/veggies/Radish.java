package model.veggies;

import model.Vegetable;

import static model.VegType.*;

public class Radish extends Vegetable {
    public Radish() {
        super("Radish", ROOT);
        setInstructions("Sow seeds 4–6 weeks before the average date of last frost.");
    }

    @Override
    public void feed() {

    }

    @Override
    public void water() {
        System.out.println("Keep soil evenly moist but not waterlogged.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest three weeks after planting");
    }
}
