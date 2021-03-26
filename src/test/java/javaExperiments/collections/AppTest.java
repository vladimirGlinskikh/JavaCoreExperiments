package javaExperiments.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    List<String> strings;
    private App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
        strings = new ArrayList();
    }

    @Test
    public void sumWithString() {
        strings.add("777");
        strings.add("1");
        int val = app.sum(strings);
        System.out.println(val);
        assertEquals(val, 778);
    }

    @Test
    public void sumWithException() {
        strings.add("One");
        int val = app.sum(strings);
        System.out.println(val);
        assertEquals(val, 0);
    }
}