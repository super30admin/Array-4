//TC: O(n), SC: O(1)
public class MaximumSubArray {

    public int maxSubArray(int[] arr) {
        int max = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], arr[i] + current);
            max = Math.max(current, max);
        }

        return max;
    }
}
