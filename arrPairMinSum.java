// Time Complexity : O(N log N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class arrPairMinSum {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        
        return sum;    
    }
}
