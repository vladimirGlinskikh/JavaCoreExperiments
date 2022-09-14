package stepic.wildcards;

public class Packer {
    public void repackage(Box<? super Bakery> to, Box<? extends Bakery> from) {
        to.put(from.get());
    }
}
