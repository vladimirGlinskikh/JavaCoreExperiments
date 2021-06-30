package functionalInterfaces.suppliers.ticketingSystem;

public class SoftwareTicket extends Ticket {
    String application;
    String version;
    Domain domain;

    public SoftwareTicket(String customerName, int id, String description, int dueDate,
                          String application, String version, Domain domain) {
        super(customerName, id, description, dueDate);
        this.application = application;
        this.version = version;
        this.domain = domain;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nAPPLICATION:       " + application
                + "\nVERSION:           " + version
                + "\nDOMAIN:            " + domain;
    }
}
