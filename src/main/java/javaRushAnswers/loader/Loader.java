package javaRushAnswers.loader;

public class Loader {
    public static void main(String[] args) {
        int milkAmount = 0;
        int powderAmount = 0;
        int eggsCount = 0;
        int sugarAmount = 0;
        int oilAmount = 0;
        int appleCount = 0;

        boolean pancakes = false;
        powderAmount = 400;
        sugarAmount = 10;
        milkAmount = 1000;
        oilAmount = 30;
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Вы можете приготовить печенье!");
            pancakes = true;
        }

        boolean omelette = false;
//        milkAmount = 300;
//        powderAmount = 5;
//        eggsCount = 5;
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Вы можете приготовить омлет!");
            omelette = true;
        }

        boolean applePie = false;
//        appleCount = 3;
//        milkAmount = 100;
//        powderAmount = 300;
//        eggsCount = 4;
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Вы можете приготовить яблочный пирог!");
            applePie = true;
        }

        if (!pancakes && !omelette && !applePie) {
            System.out.println("Вы не можете готовить без ингридиентов!");
        }
    }
}
