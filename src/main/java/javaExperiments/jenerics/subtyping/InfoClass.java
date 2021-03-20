package javaExperiments.jenerics.subtyping;


public class InfoClass {
    public static void main(String[] args) {
//        Info<String> infoString = new Info<>("Some text");
//        System.out.println(infoString.message("I'm String: ") + infoString);

        Info<Integer> infoInteger = new Info<>(23);
        System.out.println(infoInteger.message("I'm Integer: ") + infoInteger);

        Info<Double> infoDouble = new Info<>(3.12);
        System.out.println(infoDouble.message("I'm Double: ") + infoDouble);

//        Info<Object> infoObject = new Info<>(InfoClass.class);
//        System.out.println(infoInteger.message("I'm Object №: " + infoObject.hashCode()) + " and my name: " + infoObject.getClass());
    }
}
