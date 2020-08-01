package inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("A Vehicle class");
        Vehicle vehicle2 = new Car("A Car class");
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
    }
}
