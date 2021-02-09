package model;

import java.util.ArrayList;
import java.util.List;

public class CellPhone implements Traceable {
    List<Call> calls;
    String location;
    Person owner;

    public CellPhone(Person owner, String location) {
        this.owner = owner;
        this.location = location;
        calls = new ArrayList<>();
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
        System.out.println("Tracking " + owner.getName() + "'s cellphone...located at " + location + ".");
    }

    // Getter
    public List getCalls() {
        return calls;
    }

    // EFFECTS: Prints all the calls on the cellphone
    public void printCalls() {
        for (Call call : calls)
            System.out.println(call.getOutgoingCaller());
    }

    // MODIFIES: this
    // EFFECTS: Adds a call to the cellphone
    public void addCall(Call c) {
        calls.add(c);
    }

    // EFFECTS: returns the owner of the cellphone
    public Person getOwner() {
        return owner;
    }

}
