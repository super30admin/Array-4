// Time Complexity :O(n)
// Space Complexity :O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0||nums==null)
            return 0;
        int rsum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(rsum+nums[i]>nums[i]){
                rsum=rsum+nums[i];
            }
            else{
                rsum=nums[i];
            }
            if(rsum>max)
                max=rsum;
        }
        return max;
    }
}
