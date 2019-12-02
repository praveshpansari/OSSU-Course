package model;

import java.util.LinkedList;
import java.util.List;

public class Contact {

    String name, number;
    ContactType type;
    List<String> callLog;

    public Contact(String name) {
        this.name = name;
        callLog = new LinkedList<>();
        number = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public void call(String date) {
        callLog.add(date);
    }

    public String getCallLog() {
        String log = "";
        for (String call : callLog)
            log += call + "\n";
        return log;
    }

    public String automateResponse() {
        switch (type) {
            case WORK:
                return "I'll get you back at work.";
            case FRIEND:
                return "Meet you at the cafe.";
            case FAMILY:
                return "See you at home.";
            default:
                return "";
        }
    }

    public enum ContactType {
        WORK, FRIEND, FAMILY
    }

}
