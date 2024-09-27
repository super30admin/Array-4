// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
 * 1 - First, we sort the array so that we can group closely related integers together. If we form pairs without sorting,
 * we might group elements that are values apart and the minumum out of those pairs would be too small so the sum would not be maximum
 * 2 - We then run a for loop adding the even numbers so that the sum of those numbers would be maximum.
 */

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        
        Arrays.sort(nums);
        int result = 0;
        
        for(int i = 0; i < nums.length; i= i + 2)
        {
            result += nums[i];
        }
        
        return result;
    }
}
