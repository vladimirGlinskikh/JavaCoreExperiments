package functionalInterfaces.suppliers.ticketingSystem;

import java.time.LocalDate;

public class Ticket implements Comparable<Ticket> {
    String customerName;
    int id;
    String description;
    LocalDate dueDate;
    LocalDate servicedDate;

    public Ticket(String customerName, int id, String description, int dueDate) {
        this.customerName = customerName;
        this.id = id;
        this.description = description;
        this.dueDate = LocalDate.now().plusDays(dueDate);
        servicedDate = LocalDate.now().minusDays(1);
    }

    @Override
    public String toString() {
        return "NAME:                   " + customerName
                + "\nID:                " + id
                + "\nDESCRIPTION:       " + description
                + "\nDUE DATE:          " + dueDate
                + "\nSERVICE DATE:      " + servicedDate;
    }

    @Override
    public int compareTo(Ticket ticket) {
        return dueDate.compareTo(ticket.dueDate);
    }
}
