//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this :no
// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        //Initially let the max and current sum be the first element
        int max = nums[0],cursum = nums[0];
        //iterate throught the remaining elements
        for(int i=1;i<nums.length;i++){
            //update the cursum
            cursum += nums[i];
            //if this new sum is less than the current element, change the cursum
            if(cursum < nums[i]){
                cursum = nums[i];
            }
            //if the cursum is greater than teh previous max, update it with cursum
            if(cursum > max){
                max = cursum;
            }
        }
        return max;
    }
}