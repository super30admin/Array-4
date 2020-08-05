// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Sort and take the alterante array indexes sum.
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        int result  = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            result = result + nums[i];
        }
        return result;
    }
}