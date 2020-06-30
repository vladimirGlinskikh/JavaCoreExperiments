package objects.creation;

public class TestValue {
    public static void main(String[] args) {
        int i1 = 4;
        int i2 = 9;
        i2 = 2;
        System.out.println("i1 == " + i1);
        System.out.println(" but i2 == " + i2);

        Value value1 = new Value();
        value1.value = 5;
        Value value2 = value1;
        value2.value = 6;
        System.out.print("value1.value == " + value1.value);
        System.out.println(" and value2.value == " + value2.value);
    }
}
