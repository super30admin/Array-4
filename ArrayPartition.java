/*
 * TC: O(n log n)
 * SC: O(1)
 */
import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        // sort the array and sum every 2nd element
        // starting from 0th index
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
