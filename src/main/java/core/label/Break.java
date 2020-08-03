package core.label;

public class Break {
    public static void main(String[] args) {
        boolean t = false;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (!t)
                        break second;
                    System.out.println("Этот оператор не выполняется");
                }
                System.out.println("Этот оператор не выполняется");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
