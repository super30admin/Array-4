// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We can use Kadane's algo here, we will maintain 2 variables
// curSum and maxSum, we will add current no. to curSum
// Now we will assign curSum to maxSum if it is greater than itself
// if we find that curSum becomes less than 0 we will make it 0
// Finally we will return the maxSum
class Solution {
    public int maxSubArray(int[] nums) {
     int curSum = 0;
        int maxSum = nums[0];
        for(int i = 0; i < nums.length; i++){
            curSum = curSum + nums[i];
            maxSum = Math.max(maxSum, curSum);
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}