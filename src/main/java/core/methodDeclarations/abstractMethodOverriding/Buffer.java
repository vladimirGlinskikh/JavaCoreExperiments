package core.methodDeclarations.abstractMethodOverriding;

public interface Buffer {
    char get() throws BufferEmpty, BufferError;
}
