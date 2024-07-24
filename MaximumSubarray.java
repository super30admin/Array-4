// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Initialize variables: It initializes rsum (running sum) and max (maximum sum) to the first element of the array.
//Iterate through the array: It iterates through the array, updating the running sum to the maximum of either the current running sum plus the current element or just the current element, and then updates the maximum sum found so far.
//Return the maximum sum: Finally, it returns the maximum sum found.

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int rsum = nums[0], max = nums[0];

        for(int i =1; i< nums.length ; i++){
            rsum = Math.max(rsum + nums[i], nums[i]);
            max = Math.max(rsum , max);
        }
        return max;
    }
}