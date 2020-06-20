package model;

public class Fingerprint implements Traceable {

    Person owner;
    String location;

    public Fingerprint(Person owner, String location) {
        this.owner = owner;
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("This fingerprint was collected at " + location);
    }

    // EFFECTS: returns the owner of the fingerprints
    public Person getOwner() {
        return owner;
    }

}
