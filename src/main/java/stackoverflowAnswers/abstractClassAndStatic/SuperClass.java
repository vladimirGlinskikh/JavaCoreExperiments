package stackoverflowAnswers.abstractClassAndStatic;

public abstract class SuperClass {
    static String name = "Not initialized";

    public static void load(String Name) {
        name = Name;
    }

    public static String getName() {
        return name;
    }

}