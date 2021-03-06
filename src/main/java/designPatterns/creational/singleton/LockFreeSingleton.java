package designPatterns.creational.singleton;

public class LockFreeSingleton {
    private static final LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("Singleton is Instantiated.");
    }

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }

    public static void main(String[] args) {
        LockFreeSingleton.getInstance().doSomething();
    }
}
