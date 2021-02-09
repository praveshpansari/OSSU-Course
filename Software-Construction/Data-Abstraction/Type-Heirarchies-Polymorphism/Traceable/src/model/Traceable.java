package model;

public interface Traceable {

    // EFFECTS: returns the location of the traceable
    public String getLocation();

    // EFFECTS: returns the object that is traced
    public Object getTrace();

    // EFFECTS: print info. about object which is being tracked
    public void track();
}
