package functionalInterfaces.functions.salesPromotions;

public class SportRecord extends Record {
    String team;

    public SportRecord(String name, String phoneNum, int index, String team) {
        super(name, phoneNum, index);
        this.team = team;
    }

    @Override
    public String toString() {
        return super.toString() + " favorite team is the " + team;
    }
}
