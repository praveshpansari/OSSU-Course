package model;

public interface Growable {

    // EFFECTS: feeds the plants
    void feed();

    // EFFECTS: waters the plants
    void water();

    // EFFECTS: returns special instructions for this plant
    String getInstructions();

    // EFFECTS: harvests the plants
    void harvest();
}
