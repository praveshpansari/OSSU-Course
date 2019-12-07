package model.veggies;

import model.Vegetable;

import static model.VegType.LEAF;

public class Spinach extends Vegetable {
    public Spinach() {
        super("Spinach", LEAF);
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
