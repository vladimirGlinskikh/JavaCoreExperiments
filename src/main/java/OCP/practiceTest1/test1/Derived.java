package OCP.practiceTest1.test1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Derived extends Base {
    @Override
    public void print() throws IOException {
        throw new FileNotFoundException();
    }
}
