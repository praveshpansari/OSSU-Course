package ui;

import model.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>();

        orders.add(new Order(501, "Mr.James", 'A'));
        orders.add(new Order(503, "Mrs.Doe", 'C'));
        orders.add(new Order(504, "Mr.White", 'B'));

        orders.get(1).setInstructions("Less spicy.");

        orders.get(2).setInstructions("Extra cheese.");

        orders.get(0).printTicket();
        orders.get(1).printTicket();
        orders.get(1).setComplete();
        orders.get(2).setComplete();

        orders.get(1).printReceipt();
        orders.get(2).printReceipt();

    }
}
