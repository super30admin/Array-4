// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//lets take two variables curr_sum (to keep track of the sum at each element, either add the ele to the subarray or start the subarray from the ele itself if ele > subarray sum)
//max_sum (to keep track of the maximum subarray sum so far in the array)
//return the max_sum after traversing the whole array

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        
        for(int x:nums){
        curr_sum=Math.max(curr_sum+x,x);
        max_sum = Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
}