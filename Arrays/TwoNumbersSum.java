import java.util.*;

public class TwoNumbersSum {
    private static int[] sumNaive(int[] numbersArray, int neededSum) {
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray.length; j++) {
                if ((i != j) && numbersArray[i] + numbersArray[j] == neededSum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    private static int[] sumSet(int[] numbers, int neededSum) {
        Set<Integer> arrayCopy = new HashSet<>();
        for (int number: numbers) {
            int searchedNumber = neededSum - number;

            if (arrayCopy.contains(searchedNumber)) {
                return new int[]{number, searchedNumber};
            } else {
                arrayCopy.add(number);
            }
        }
        return new int[]{};
    }

    private static int[] sumLeftRight(int[] numbers, int neededSum){
        Arrays.sort(numbers);
        int leftIndex = 0;
        int rightIndex = numbers.length-1;

        while (leftIndex < rightIndex) {
            int currentSum = numbers[leftIndex]+numbers[rightIndex];
            if (currentSum == neededSum) {
                return new int[]{numbers[leftIndex], numbers[rightIndex]};
            } else if (currentSum < neededSum) {
                leftIndex += 1;
            } else {
                rightIndex -= 1;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumNaive(new int[]{1, 2, 5, 9, 11, -3, 4}, 20)));
    }
}