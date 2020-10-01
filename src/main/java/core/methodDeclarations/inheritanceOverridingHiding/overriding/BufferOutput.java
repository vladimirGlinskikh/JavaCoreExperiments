package core.methodDeclarations.inheritanceOverridingHiding.overriding;

import java.io.IOException;
import java.io.OutputStream;

public class BufferOutput {
    private OutputStream o;

    BufferOutput(OutputStream o) {
        this.o = o;
    }

    protected byte[] buf = new byte[512];
    protected int pos = 0;

    public void putchar(char c) throws IOException {
        if (pos == buf.length) flush();
        buf[pos++] = (byte) c;
    }

    public void putstr(String s) throws IOException {
        for (int i = 0; i < s.length(); i++)
            putchar(s.charAt(i));
    }

    public void flush() throws IOException {
        o.write(buf, 0, pos);
        pos = 0;
    }
}
