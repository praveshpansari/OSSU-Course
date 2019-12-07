package ui;

import model.Vegetable;
import model.veggies.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList<>();
        garden.add(new Radish());
        garden.add(new Cabbage());
        garden.add(new Corn());
        garden.add(new Spinach());
        garden.add(new Beetroot());

        for (Vegetable veggie : garden) {
            System.out.println(veggie.getName());
            veggie.feed();
            veggie.water();
            System.out.println(veggie.getInstructions());
            veggie.harvest();
        }

    }
}
