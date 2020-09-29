package core.methodDeclarations.synchronizedMethod;

public class BumpTest {
    int count;

    void bump() {
        synchronized (this) {
            count++;
        }
    }

    static int classCount;

    static void classBump() {
        try {
            synchronized (Class.forName("BumpTest")) {
                classCount++;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
