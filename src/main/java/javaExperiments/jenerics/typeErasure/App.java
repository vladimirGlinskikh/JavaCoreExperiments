package javaExperiments.jenerics.typeErasure;

public class App {
    public static void main(String[] args) {


    }

//    public void abc(Info<String> info) {
//        String i = info.getValue();
//    }

    public void abc(Info<Integer> info) {
        Integer i = info.getValue();
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
}
