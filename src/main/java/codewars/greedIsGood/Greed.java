package codewars.greedIsGood;

public class Greed {
//    Three 1's => 1000 points
//    Three 6's =>  600 points
//    Three 5's =>  500 points
//    Three 4's =>  400 points
//    Three 3's =>  300 points
//    Three 2's =>  200 points
//    One   1   =>  100 points
//    One   5   =>   50 point

    //            5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
    //            1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
    //            2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
    public static void main(String[] args) {
        System.out.println(Greed.greedy(new int[]{1, 1, 1, 3, 1}));
    }

    public static int greedy(int[] dice) {
        int[] diceStart = {0, 0, 0, 0, 0, 0, 0};
        int count = 0;

        for (Integer value : dice)
            diceStart[value]++;

        for (int i = 1; i < diceStart.length; i++) {
            switch (i) {
                case 1 -> count += (diceStart[i] > 2 ? 1000 + (diceStart[1] - 3) * 100 : diceStart[i] * 100);
                case 5 -> count += (diceStart[i] > 2 ? 500 + (diceStart[5] - 3) * 50 : diceStart[5] * 50);
                default -> count += (diceStart[i] > 2 ? i * 100 : 0);
            }
        }
        return count;
    }
}
