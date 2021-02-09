package ui;

import model.Contact;

import java.util.Scanner;

import static model.Contact.ContactType.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To add a new contact, type in their name, then press 'enter':");
        Contact c = new Contact(s.next());
        System.out.println("Add a phone number for " + c.getName() + ":");
        c.setNumber(s.next());
        System.out.println("Please set the contact type:\nEnter '1' for 'WORK',\n'2' for 'FRIEND',\n'3' for 'FAMILY'.");
        switch (s.next()) {
            case "1":
                c.setType(WORK);
                break;
            case "2":
                c.setType(FRIEND);
                break;
            case "3":
                c.setType(FAMILY);
                break;
            default:
                System.out.println("Invalid key. Skipping this step.");
                break;
        }
        System.out.println("Would you like to call " + c.getName() + " now? Type 'y' for yes, 'n' for no.");
        options(c, s);
        System.out.println(c.automateResponse());
    }

    private static void options(Contact c, Scanner s) {
        String option = s.next();
        if (option.equals("y")) {
            System.out.println("Enter a date for the call in the format MM/DD/YY:");
            c.call(s.next());
            System.out.println("Here is your updated call history:");
            System.out.println(c.getCallLog());
        } else if (option.equals("n")) {
            System.out.println("Call history: No Calls.");
        }
    }


}
