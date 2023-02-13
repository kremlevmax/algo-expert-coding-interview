import java.util.*;

class NonConstructibleChange {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        if (coins.length == 0 || coins[0] != 1) {
            return 1;
        } else {
            int change = coins[0];

            for (int i = 1; i < coins.length; i++) {
                if (change + 1 < coins[i]) {
                    return change+1;
                }
                change += coins[i];
            }
            return change+1;
        }
    }

    public static void main(String[] args) {
        System.out.println(nonConstructibleChange(new int[]{}));
        System.out.println(nonConstructibleChange(new int[]{1, 2, 3}));
        System.out.println(nonConstructibleChange(new int[]{1, 2, 5}));

    }
}