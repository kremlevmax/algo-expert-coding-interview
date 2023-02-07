import java.util.*;

public class TwoNumbersSum {
    private static int[] sumNaive(int[] numbersArray, int neededSum) {
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray.length; j++) {
                if ((i != j) && numbersArray[i] + numbersArray[j] == neededSum) {
                    return new int[]{numbersArray[i], numbersArray[j]};
                }
            }
        }
        return new int[2];
    }

    private static int[] sumSet(int[] numbers) {
    
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumNaive(new int[]{1, 2, 5, 9, 11, -3, 4}, 6)[1]));
    }
}