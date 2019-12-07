package model.veggies;

import model.Vegetable;

import static model.VegType.SEED;

public class Corn extends Vegetable {
    public Corn() {
        super("Corn", SEED);
        setInstructions("Do not plant when there is still a risk of frost.");
    }

    @Override
    public void feed() {
        System.out.println("Work plenty of aged manure into the soil in advance.");
    }

    @Override
    public void water() {
        System.out.println("Provide at least 1 inch of water a week.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest after the tassels at the end of the ears have turned dark brown.");
    }
}
