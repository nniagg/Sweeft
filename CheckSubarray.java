public class CheckSubarray {

    public static boolean isValidSequence(int[] array, int[] sequence) {
        int arrayIndex = 0; 
        int sequenceIndex = 0;

        while (arrayIndex < array.length && sequenceIndex < sequence.length) {
            if (array[arrayIndex] == sequence[sequenceIndex]) {
                sequenceIndex++;
            }
            arrayIndex++;
        }

        return sequenceIndex == sequence.length;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};
        boolean isValid = isValidSequence(array, sequence);
        System.out.println(isValid);
    }
}
