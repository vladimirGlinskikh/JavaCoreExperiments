package core.algorithms.array.classDataArray;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray array = new ClassDataArray(maxSize);

        array.insert("Vladimir", "Glinskikh", 45);
        array.insert("Andrey", "Shatalov", 50);
        array.insert("Vasiliy", "Tkachuk", 46);
        array.insert("Lubov", "Kim", 39);
        array.insert("Ivan", "Gorbachenko", 64);
        array.insert("Andrey", "Grishenko", 44);
        array.insert("Andrey", "Tkach", 34);
        array.insert("Natalia", "Martakova", 39);
        array.insert("Valentina", "Shpakova", 49);
        array.insert("Lena", "Gay", 34);

        array.displayA();

        String searchKey = "Ivan";
        Person found;
        found = array.find(searchKey);
        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Lena, Ivan, Vladimir");
        array.delete("Lena");
        array.delete("Ivan");
        array.delete("Vladimir");

        array.displayA();
    }
}
