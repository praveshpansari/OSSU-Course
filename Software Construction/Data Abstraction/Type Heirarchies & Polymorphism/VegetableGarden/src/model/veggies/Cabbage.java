package model.veggies;

import model.Vegetable;
import static model.VegType.*;

public class Cabbage extends Vegetable {
    public Cabbage() {
        super("Cabbage", LEAF);
        setInstructions("Some instructions");
    }

    @Override
    public void feed() {

    }

    @Override
    public void water() {

    }

    @Override
    public void harvest() {

    }
}
