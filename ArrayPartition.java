//Time Complexity:O(nlogn)
//SPace Complexity:O(1)

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        Arrays.sort(nums);
        int total = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            total = total + nums[i];
        }
        return total;
    }

    public static void main(String[] args) {
        // Create an instance of ArrayPartition
        ArrayPartition ap = new ArrayPartition();

        // Test case 1: Example input
        int[] nums1 = { 1, 4, 3, 2 };
        int result1 = ap.arrayPairSum(nums1);
        System.out.println("Test Case 1 Result: " + result1);
    }
}
