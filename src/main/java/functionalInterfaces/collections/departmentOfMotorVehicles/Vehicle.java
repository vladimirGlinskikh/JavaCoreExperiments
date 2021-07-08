package functionalInterfaces.collections.departmentOfMotorVehicles;

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
