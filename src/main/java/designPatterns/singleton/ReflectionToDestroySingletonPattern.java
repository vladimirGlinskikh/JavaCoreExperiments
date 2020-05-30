package designPatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionToDestroySingletonPattern {
    public static void main(String[] args) {
        ThreadSafe instanceOne = ThreadSafe.getInstanceUsingDoubleLocking();
        ThreadSafe instanceTwo = null;
        try {
            Constructor[] constructors = ThreadSafe.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (ThreadSafe) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
