package model;

public class Call implements Traceable {

    String location;
    Person outgoing;

    public Call(Person outgoing, String location) {
        this.location = location;
        this.outgoing = outgoing;
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
        System.out.println("This call is made from " + location + " to " + outgoing.getName());
    }

    // EFFECTS: returns the person being called
    public Person getOutgoingCaller() {
        return outgoing;
    }

}
