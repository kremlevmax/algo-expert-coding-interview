import java.lang.Math.*;
import java.util.*;

class SortedSquaredArray {
    public static int[] squareArray(int[] array) {
        int[] resultArray = new int[array.length];
        int startIndex = 0;
        int endIndex = array.length-1;
        int indexToAdd = array.length-1;

        while (indexToAdd >= 0){
            if (Math.abs(array[startIndex])>Math.abs(array[endIndex])) {
                resultArray[indexToAdd] = array[startIndex]*array[startIndex];
                startIndex += 1;
            } else {
                resultArray[indexToAdd] = array[endIndex]*array[endIndex];
                endIndex -= 1;
            }
            indexToAdd -= 1;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareArray(new int[]{-7, -2, 1, 7, 9})));

    }
}