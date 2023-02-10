import java.util.*;

class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;

        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex += 1;
            }
            arrayIndex += 1;
        }
        return sequenceIndex == sequence.size();
    }

    public static void main(String[] args) {
        System.out.println(isValidSubsequence(new ArrayList<Integer>(Arrays. asList(1, 8, -1, 2, 3, 4, 5, 6)), new ArrayList<Integer>(Arrays. asList(-7, 5))));
    }
}