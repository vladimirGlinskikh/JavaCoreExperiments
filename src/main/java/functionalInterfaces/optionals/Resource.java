package functionalInterfaces.optionals;

public class Resource {
    static int count = 3;

    public Resource() {
        count--;
        System.out.println("Resource consumed, " + count + " remaining.");
    }
}
