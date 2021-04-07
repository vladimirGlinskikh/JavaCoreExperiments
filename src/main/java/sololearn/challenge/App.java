package sololearn.challenge;

public class App {
    public static void main(String[] args) {
//        int[] a = {3, 5, 7, 6, 1};
//        int sum = 0;
//        for (int b : a){
//            sum = sum + (b + 1);
//        }
//        System.out.println(sum);

//        int x = 2, y = 2, z;
//        if (++x > 2 && y-- < 2) {
//            z = x + y;
//            System.out.println(z);
//        } else {
//            System.out.println(x);
//        }

        int x = 2;
        for (int i = 1; i < 4; i++) { // i = 1, 2, 3, 4
            x += i; // x = 2, 3, 5, 8
        }
        System.out.println(x % 4 * 1); //0
    }
}

