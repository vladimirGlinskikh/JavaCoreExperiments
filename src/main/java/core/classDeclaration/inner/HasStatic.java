package core.classDeclaration.inner;

class HasStatic {
    static int j = 100;
}

class Outer {
    class Inner extends HasStatic {
        static final int x = 3; // OK: constant variable
//        static int y = 5; // Compile time error: because an inner class
    }

    static class NestedButNotInner {
        static int z = 5; // OK: not an inner class
    }

    interface NeverInner {
    } // Interface are never inner class
}
