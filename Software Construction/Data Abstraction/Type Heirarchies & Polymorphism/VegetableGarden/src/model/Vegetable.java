package model;

public abstract class Vegetable implements Growable {

    public Vegetable(String name, VegType type) {

    }

    // EFFECTS: returns the name of the vegetable
    public String getName() {
        return "";
    }

    // MODIFIES: this
    // EFFECTS: sets the name of the vegetable
    public void setName(String name) {
    }

    // EFFECTS: returns the instructions associated to
    //          the this vegetable object
    @Override
    public String getInstructions() {
        return "";
    }

    // MODIFIES: this
    // EFFECTS: sets the instructions of this vegetable
    protected void setInstructions(String instructions) {
    }

    // EFFECTS: Returns the type of the vegetable
    public VegType getType() {
        return null;
    }

}
