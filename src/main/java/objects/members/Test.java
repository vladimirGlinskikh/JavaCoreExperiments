package objects.members;

public class Test {
    <T extends C & I> void test(T t) {
        t.mI(); //Ok
        t.mCPublic(); //Ok
        t.mCProtected(); //Ok
        t.mCPackage(); //Ok
//        t.mCPrivate(); //Compile-time error
    }
}
