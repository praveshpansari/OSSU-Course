package model;

import java.util.ArrayList;
import java.util.List;

import static model.TransactionType.FOOD;

public class TransactionSummary {

    private String name;
    private List<Transaction> transactions;

    public TransactionSummary(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public int getNumTransactions() {
        return transactions.size();
    }

    // REQUIRES: t is not already within transactions
    // MODIFIES: this
    // EFFECTS: adds the given transaction t to the list of transactions
    public void addTransaction(Transaction t) {
        if (!transactions.contains(t))
            transactions.add(t);
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: computes the average amount of money spent on a transaction
    public double averageTransactionCost() {
        int amount = 0;
        if (!transactions.isEmpty()) {
            for (Transaction t : transactions)
                amount += t.getAmount();
            return amount / getNumTransactions();
        }
        return 0;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS:  returns the average cost of all transactions of type specificType in this
    //           TransactionSummary
    public double specificTypeAverage(TransactionType specificType) {
        int average = 0, count = 0;
        for(Transaction t:transactions)
            if (t.getType() == specificType) {
                average += t.getAmount();
                count++;
            }
        return average / count;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: returns the largest transaction (in terms of cost) in this TransactionSummary
    public Transaction largestTransaction() {
        Transaction largest = new Transaction("temp", "temp date", 0, FOOD);
        for (Transaction t : transactions)
            if (t.getAmount() > largest.getAmount())
                largest = t;

        return largest;
    }

    // EFFECTS: returns true if the given transaction is contained within the list of transactions
    public boolean contains(Transaction t) {
        return transactions.contains(t);
    }


}
