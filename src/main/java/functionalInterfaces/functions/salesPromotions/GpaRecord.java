package functionalInterfaces.functions.salesPromotions;

public class GpaRecord extends Record {
    String subject;

    public GpaRecord(String name, String phoneNum, int index, String subject) {
        super(name, phoneNum, index);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " favorite subject is " + subject;
    }
}
