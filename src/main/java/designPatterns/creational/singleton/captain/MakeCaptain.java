package designPatterns.creational.singleton.captain;

public class MakeCaptain {
    private MakeCaptain() {
    }

    private static class SingletonHelper {
        private static final MakeCaptain captain = new MakeCaptain();
    }

    public static MakeCaptain getCaptain() {
        return SingletonHelper.captain;
    }
}
