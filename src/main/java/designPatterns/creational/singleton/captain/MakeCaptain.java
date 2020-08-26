package designPatterns.creational.singleton.captain;

public class MakeCaptain {
    private static MakeCaptain captain;

    private MakeCaptain() {
    }

    public static MakeCaptain getCaptain() {
        if (captain == null) {
            captain = new MakeCaptain();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }
}
