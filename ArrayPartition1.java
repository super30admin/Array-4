// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Sort the array and take sum of elements at the odd index.

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            sum = sum + nums[i];
        }
        return sum;
    }
}
