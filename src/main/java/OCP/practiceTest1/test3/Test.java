package OCP.practiceTest1.test3;

public class Test {
    public static void main(String[] args) {
        Buyable[] arr = new Buyable[2];
        for (Buyable b : arr) {
            System.out.println(b.salePercentage); // Line n1
//            System.out.println(b.salePercentage()); // Line n2
        }

        Book[] books = new Book[2];
        for (Book b : books) {
            System.out.println(b.salePercentage); // Line n3
//            System.out.println(b.salePercentage()); // Line n4
        }
    }
}


/*
Reason :

Variable 'salePercentage' declared inside interface Buyable is
implicitly public, static and final. As per Java 8, default and static
methods were added in the interface and as per Java 9, private
methods were added in the interface. There is no compilation error in
Buyable.java file.

class Book implements Buyable interface but as there is no abstract
method in Buyable interface, hence Book class is not needed to
implement any method. Book.java file compiles successfully.
Buyable [] arr = new Buyable[2]; creates one dimensional array of
2 elements of Buyable type and both the elements are initialized to
null.

There are some difference in which static variables and static
methods of the interface are accessed.
Correct and only way to access static method of an Interface is by
using the name of the interface, such as Buyable.salePercentage().
Line n2 and Line n4 cause compilation error.

As far as public static final variable of interface is concerned, even
through the correct way to access static variable is by using the name
of the interface, such as Buyable.salePercentage but it can also be accessed by using following :
Reference variable of the interface:
Buyable obj1 = null;
System.out.println(obj1.salePercentage);

Name of the implementer class:
System.out.println(Book.salePercentage);

Reference variable of the implementer class:
Book obj2 = null;
System.out.println(obj2.salePercentage);
Hence, Line n1 and Line n3 compile successfully.
*/


