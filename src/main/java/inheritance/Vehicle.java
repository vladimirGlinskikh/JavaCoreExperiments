package inheritance;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Vehicle: " + name;
    }
}
