package model;

public abstract class Vegetable implements Growable {
    public Vegetable(String name, VegType type) {

    }

    public String getName() {
        return "";
    }

    public void setName() {
    }

    @Override
    public String getInstructions() {
        return "";
    }

    protected void setInstructions(String instructions) {
    }

    public VegType getType() {
        return VegType.ROOT;
    }

}
