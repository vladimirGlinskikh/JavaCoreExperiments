package functionalInterfaces.suppliers.ticketingSystem;

public class HardwareTicket extends Ticket {

    String device;
    String model;
    String serialNumber;


    public HardwareTicket(String customerName, int id, String description, int dueDate,
                          String device, String model, String serialNumber) {
        super(customerName, id, description, dueDate);
        this.device = device;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nDEVICE:          " + device
                + "\nMODEL:           " + model
                + "\nSERIAL NUMBER:   " + serialNumber;
    }
}
