import java.util.Arrays;
/*
Array Partition
approach: always select minimum of max pairs, so we sort and select first element of each pair
time: O(n log n)
space: O(1)
 */
public class Problem1 {
    public int arrayPairSum(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2) {
            count+=nums[i];
        }

        return count;
    }
}
