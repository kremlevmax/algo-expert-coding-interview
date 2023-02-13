import java.util.*;

class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum){
        List<Integer[]> result = new ArrayList<>();

        int currentSum = 0;


        for (int i = 0; i < array.length-2; i++) {
            int leftIndex = i+1;
            int rightIndex = array.length-1;

            while (leftIndex < rightIndex) {
                currentSum = array[i] + array[leftIndex] + array[rightIndex];

                if (currentSum == targetSum) {
                    result.add(new Integer[]{array[i], array[leftIndex], array[rightIndex]});
                    leftIndex += 1;
                    rightIndex -= 1;
                } else if (currentSum < targetSum) {
                    leftIndex += 1;
                } else {
                    rightIndex -= 1;
                }
            }
        }

        return result;
    }
}