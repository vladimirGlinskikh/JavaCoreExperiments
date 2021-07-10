package functionalInterfaces.comparingObjects.realEstateBroker;

public class Home {
    String community;
    double price;
    int numBedrooms;
    double acres;
    double schoolDistance;
    double trainDistance;

    public Home(String community, double price, int numBedrooms,
                double acres, double schoolDistance, double trainDistance) {
        this.community = community;
        this.price = price;
        this.numBedrooms = numBedrooms;
        this.acres = acres;
        this.schoolDistance = schoolDistance;
        this.trainDistance = trainDistance;
    }

    @Override
    public String toString() {
        return numBedrooms + " bedroom house in " + community
                + " for $" + price + " on " + acres + " acres\n "
                + schoolDistance + " miles from school "
                + trainDistance + " miles from train";
    }
}
