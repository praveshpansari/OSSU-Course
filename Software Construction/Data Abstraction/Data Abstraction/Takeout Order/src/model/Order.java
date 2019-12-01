package model;

public class Order {

    char combo;
    int ticketNum;
    String customerName, special;
    boolean status;
    double price;

    // REQUIRE: A customer choosing only available combos
    // MODIFIES: this
    // EFFECTS: Sets the ticketNum, name and the combo
    //          Set status to false as order just ordered
    public Order(int ticketNum, String customerName, char combo) {
        this.ticketNum = ticketNum;
        this.customerName = customerName;
        this.combo = combo;
        this.status = false;
        this.special = "None";
        this.setPriceByCombo();
    }

    // accessor
    public boolean getStatus() {
        return status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getSpecial() {
        return special;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public char getCombo() {
        return combo;
    }

    public double getPrice() {
        return price;
    }

    // mutator
    public void setInstructions(String special) {
        this.special = special;
    }

    public void setComplete() {
        status = true;
    }

    // EFFECTS: prints the ticketNum, combo, and special info
    public void printTicket() {
        System.out.println(ticketNum + " COMBO: " + combo + " - SPECIAL INSTRUCTIONS: " + special);
    }

    // EFFECTS: print the receipt for the customer
    public void printReceipt() {
        System.out.println(customerName + " - " + ticketNum + " - Combo: " + combo + " - $" + price);
    }

    // MODIFIES: this
    // EFFECTS: calculate the price of the combo
    public void setPriceByCombo() {
        switch (combo) {
            case 'A':
                this.price = 5.99;
                break;
            case 'B':
                this.price = 3.99;
                break;
            case 'C':
                this.price = 9.99;
                break;
            case 'D':
                this.price = 13.35;
                break;
            case 'E':
                this.price = 7.65;
                break;
        }
    }
}
