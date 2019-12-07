package model.veggies;

import model.Vegetable;

import static model.VegType.LEAF;

public class Spinach extends Vegetable {
    public Spinach() {
        super("Spinach", LEAF);
        setInstructions("Water the new plants well in the spring.");
    }

    @Override
    public void feed() {
        System.out.println("Fertilize only if necessary due to slow growth.");
    }

    @Override
    public void water() {
        System.out.println("Water regularly.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest when leaves reach the desired size.");
    }
}
