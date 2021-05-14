package algorithms.storingObjects;

public class App {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray array = new DataArray(maxSize);
        array.insert("Glinskikh", "Vladimir", 98);
        array.insert("Smith", "Lorrane", 34);
        array.insert("Adams", "Henry", 23);
        array.insert("Stims", "Jose", 56);
        array.insert("Lamarique", "Lucinda", 24);
        array.insert("Velasque", "Adam", 45);
        array.insert("Vang", "Gong", 28);
        array.insert("Evans", "Tom", 46);
        array.insert("Hashimo", "Moto", 49);
        array.insert("Yee", "Lee", 30);

        array.displayA();

        String searchKey = "Stims";
        Person found = array.find(searchKey);
        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);
        System.out.println("Deleting Smith, Yee, and Vang");
        array.delete("Smith");
        array.delete("Yee");
        array.delete("Vang");
        array.displayA();
    }
}
