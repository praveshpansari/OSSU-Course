package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Harry", 19, "13 Central Park, Amsterdam");
        Person p2 = new Person("Sherlock", 25, "13B Baker Street, London");
        Fingerprint f1 = new Fingerprint(p1, "24 Parker Lane, San Fransisco");
        p1.setFingerprint(f1);
        p1.track();
        f1.track();
        CellPhone c1 = new CellPhone(p1, "18 Central Avenue, New York");
        c1.track();
        Call call1 = new Call(p2, "13B Baker Street, London");
        c1.addCall(call1);
        call1.track();
        c1.printCalls();
    }

}
