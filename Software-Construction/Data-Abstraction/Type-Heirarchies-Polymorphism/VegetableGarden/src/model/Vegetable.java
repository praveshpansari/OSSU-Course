package model;

public abstract class Vegetable implements Growable {
    String name, instructions;
    VegType type;

    public Vegetable(String name, VegType type) {
        this.name = name;
        this.type = type;
        instructions = "";
    }

    // EFFECTS: returns the name of the vegetable
    public String getName() {
        return name;
    }

    // MODIFIES: this
    // EFFECTS: sets the name of the vegetable
    public void setName(String name) {
        this.name = name;
    }

    // EFFECTS: returns the instructions associated to
    //          the this vegetable object
    @Override
    public String getInstructions() {
        return instructions;
    }

    // MODIFIES: this
    // EFFECTS: sets the instructions of this vegetable
    protected void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    // EFFECTS: Returns the type of the vegetable
    public VegType getType() {
        return type;
    }

}
