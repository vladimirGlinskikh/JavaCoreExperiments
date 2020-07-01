package core.inner.anonymousInner.nested;

import core.inner.anonymousInner.nested.OuterClass.*;

import java.util.Arrays;

public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(1, 2, 3, 4);

        //static nested classes example
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        StaticNestedClass staticNestedClass1 = new StaticNestedClass();

        System.out.println(staticNestedClass.getName());
        staticNestedClass.d = 11;
        System.out.println(staticNestedClass.d);
        System.out.println(staticNestedClass1.d);

        //core.inner class example
        InnerClass innerClass = outer.new InnerClass();
        System.out.println(innerClass.getName());
        System.out.println(innerClass);
        innerClass.setValues();
        System.out.println(innerClass);

        //calling method using local core.inner class
        outer.print("Outer");

        //calling method using anonymous core.inner class
        System.out.println(Arrays.toString(outer.getFilesInDir("./src/main/java/core.inner/anonymousInner/nested", ".java")));
    }
}
