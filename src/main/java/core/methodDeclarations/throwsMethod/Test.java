package core.methodDeclarations.throwsMethod;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try {
            AccessController.doPrivileged(
                    (PrivilegedExceptionAction<FileNotFoundException>) () -> {

                    }
            );
        } catch (FileNotFoundException ignored) {

        }
    }
}
