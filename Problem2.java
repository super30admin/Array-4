package Array4;

/**
 * We are essentially using DP to where we check if the current subarray is to
 * be continued or a new subarray has to be started at every point.
 * 
 * Time Complexity : O(n)- where n is length of given array
 * 
 * Space Complexity : O(1)
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem2 {
    public int maxSubArray(int[] nums) {
        int maxTillNow=nums[0];
        int maxSum=Integer.MIN_VALUE;
        maxSum=Math.max(maxSum, maxTillNow);


        if(nums.length==1)
            return maxTillNow;

        for(int i=1;i<nums.length;i++){
            maxTillNow=Math.max(nums[i],nums[i]+maxTillNow);
            maxSum=Math.max(maxSum, maxTillNow);
        }

        return maxSum;
    }
}
