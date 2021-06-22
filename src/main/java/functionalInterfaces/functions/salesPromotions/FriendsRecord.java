package functionalInterfaces.functions.salesPromotions;

public class FriendsRecord extends Record {
    String friends;

    public FriendsRecord(String name, String phoneNum, int index, String friends) {
        super(name, phoneNum, index);
        this.friends = friends;
    }

    @Override
    public String toString() {
        return super.toString() + " friends are " + friends;
    }
}
