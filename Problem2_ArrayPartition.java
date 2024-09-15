// Time Complexity :o(N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
       
        if(nums==null||nums.length==0)
            return 0;
        
        Arrays.sort(nums);
        
        int sum=0;
        
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
}