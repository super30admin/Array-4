import java.util.Arrays;

/**
 * LEetCode Problem 561: Array Partition I
 * Url: https://leetcode.com/problems/array-partition-i/
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int maxSum = new ArrayPartition().arrayPairSum(new int[] { 1, 4, 3, 2 });
        System.out.println(maxSum); // Output: 4

        int maxSum2 = new ArrayPartition().arrayPairSum(new int[] { 6, 2, 6, 5, 1, 2 });
        System.out.println(maxSum2); // Output: 9

    }
}