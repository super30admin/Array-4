/*
Approach - Sort the array and take min of pair and keep adding to results
Time Complexity - O(nlogN)
Space complexity - O(1)
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
*/
import java.util.Arrays;
public class ArrayPartition_LC_561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i<nums.length; i+=2) {
            result += nums[i]; // 1234
        }
        return result;
    }
}