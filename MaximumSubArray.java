// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/*
 * while iterating over the array we check the sum of prev and curr is greater than curr if it is greater then we consider prev element in the sub-array and replace the curr with sum and move forward if we find an exception we start fresh by considering curr as start of sub-array and move forward
 * we keep track of max while iterating and update when the sum is greater
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=1; i< nums.length; i++){
            if(nums[i - 1] + nums[i] > nums[i]){
                nums[i] = nums[i - 1] + nums[i];
            }
            if(max < nums[i]){
                    max = nums[i];
                }
            
        }
        
       
    

        return max;
    }
}