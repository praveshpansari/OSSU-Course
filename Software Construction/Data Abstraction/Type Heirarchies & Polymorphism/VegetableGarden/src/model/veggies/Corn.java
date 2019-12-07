package model.veggies;

import model.Vegetable;

import static model.VegType.SEED;

public class Corn extends Vegetable {
    public Corn() {
        super("Corn", SEED);
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
