package designPatterns.creational.singleton.captain;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Singleton pattern--\n");
        System.out.println("Trying to make a captain for our team");
        MakeCaptain captain = MakeCaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        MakeCaptain captain1 = MakeCaptain.getCaptain();
        if (captain == captain1) {
            System.out.println("captain and captain1 are the same instance");
        }
    }
}
