package javaExperiments.nestedClasses.localInnerClass;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math {

    public void getResult() {
        class Division {
            private int divider;
            private int divided;

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getDivided() {
                return divided;
            }

            public void setDivided(int divided) {
                this.divided = divided;
            }

            public int getQuotient() {
                return divided / divider;
            }

            public int getRemainder() {
                return divided % divider;
            }

        }
        Division division = new Division();
        division.setDivided(21);
        division.setDivider(4);
        System.out.println("Divided: " + division.getDivided());
        System.out.println("Divider: " + division.getDivider());
        System.out.println("Quotient: " + division.getQuotient());
        System.out.println("Remainder: " + division.getRemainder());
    }
}
