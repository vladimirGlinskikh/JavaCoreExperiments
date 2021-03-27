package javaExperiments.nestedClasses.anonymousInnerClass;

interface Math {
    int doOperation(int a, int b);
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Math m = Integer::sum;
        System.out.println(m.doOperation(4, 3));
    }
}
