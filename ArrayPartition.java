import java.util.Arrays;

/**
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * Did this code successfully run on Leetcode: Yes
 * Any problem you faced while coding this: None

 * Approach:
 * 1. Sort and use alternate numbers as they would be minimum in consecutive range
 * 
 * 2. Using Counting sort approach -
 * Create a frequency array for the range [-10000, 10000]
 * Reconstruct sorted numbers and sum every alternate element
 * toggle to pick only alternates
 */

public class ArrayPartition {
    // Approach 1 - sort and pick alternates
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            total += nums[i];
        }

        return total;
    }

    // Approach 2 - counting sort
    public int arrayPairSum2(int[] nums) {
         int[] freq = new int[20001];
         for (int num : nums) {
             freq[num + 10000]++;
         }
 
         int sum = 0;
         boolean take = true; 
 
         for (int i = 0; i < freq.length; i++) {
             while (freq[i] > 0) {
                 if (take) { 
                     sum += (i - 10000);
                 }
                 take = !take;
                 freq[i]--;
             }
         }
 
         return sum;
    }
    public static void main(String[] args) {
        // Your code here
    }
}