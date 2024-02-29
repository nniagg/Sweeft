import java.util.HashMap;

public class MaximumElementsSum {

    public static int lenOfLongSubarr(int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int maxCount = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (map.containsKey(sum - k)) {
                maxCount = Math.max(maxCount, map.get(sum - k) + 1);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, Math.max(map.getOrDefault(sum, 0), i + 1));
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 2, 3, 4, 1, 1};
        int k = 8;
        int maxCount = lenOfLongSubarr(array, k);
        System.out.println("Maximum number of elements whose sum is equal to " + k + ": " + maxCount);
    }
}
