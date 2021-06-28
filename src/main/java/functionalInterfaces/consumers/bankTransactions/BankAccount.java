package functionalInterfaces.consumers.bankTransactions;

import java.util.Objects;

public class BankAccount {
    String name;
    int id;
    double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object bankAccount) {
        return id == ((BankAccount) bankAccount).id;
    }

    @Override
    public String toString() {
        return "name = " + name + " id = " + id + " balance = " + balance;
    }
}
