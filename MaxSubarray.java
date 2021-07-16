/*Running Time complexity: O(n)
Space Complexity: Constant 
Successfully Run and Compiled on leetcode
*/
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int rsum = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            rsum = Math.max(rsum+nums[i],nums[i]);
            max = Math.max(max,rsum);
        
        }
        
        return max;
    }
}