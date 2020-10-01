package core.methodDeclarations.throwsMethod;

public interface PrivilegedExceptionAction<E extends Exception> {
    void run() throws E;
}
