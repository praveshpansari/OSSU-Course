package model.veggies;

import model.Vegetable;
import static model.VegType.*;

public class Beetroot extends Vegetable {
    public Beetroot() {
        super("Beetroot", ROOT);
        setInstructions("Thin seedlings to 3 to 4 inches apart when they are a few inches tall. Pinch or cut off the leaves.");
    }

    @Override
    public void feed() {

    }

    @Override
    public void water() {
        System.out.println("Water regularly with about 1 inch per week.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest when golf ball-size or larger.");
    }
}
