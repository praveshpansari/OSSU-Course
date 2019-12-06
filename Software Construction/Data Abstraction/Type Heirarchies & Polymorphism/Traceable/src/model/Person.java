package model;

public class Person implements Traceable {

    String name, location;
    Fingerprint fingerprint;
    int age;

    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
        fingerprint = null;
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
        System.out.println("This person is located at " + location);
    }

    // getter
    public String getName() {
        return name;
    }

    // EFFECTS: returns the fingerprint of this person
    public Fingerprint getFingerprint() {
        return fingerprint;
    }

    // MODIFIES: this
    // EFFECTS: sets this person's fingerprints
    public void setFingerprint(Fingerprint f) {
        fingerprint = f;
    }

}
