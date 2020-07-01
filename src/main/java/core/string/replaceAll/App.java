package core.string.replaceAll;

public class App {
    public static void main(String[] args) {
        String string = "Hello Java! This is the number: 12345";
        System.out.println("Original String: " + string);
        System.out.println("--------");
        String replace = string.replaceFirst("[0-9]", "*");
        System.out.println("New String: " + replace);

//        String core.string = "Dear #Employee#, your current salary is #salary#$.";
//        Map<String, String> values = new HashMap<>();
//        values.put("#Employee#", "Vladimir");
//        values.put("#salary#", "3000");
//        for (String key : values.keySet()) {
//            core.string = core.string.replaceAll(key, values.get(key));
//        }
//        System.out.println(core.string);
    }
}
