package functionalInterfaces.functions.salesPromotions;

public abstract class Record {
    String name;
    String phoneNum;
    int index;

    public Record(String name, String phoneNum, int index) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.index = index;
    }

    @Override
    public String toString() {
        return "name: " + name + " phone number: " + phoneNum;
    }
}
