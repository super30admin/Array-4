// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

package org.example;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        int st = 0; int currSt = 0; int end = 0;

        for(int i=0; i<nums.length; i++){
            currSum += nums[i];
            if(currSum < nums[i])
            {
                currSum = nums[i];
                currSt = i;
            }
            if(max < currSum){
                max = currSum;
                st = currSt;
                end = i;

            }
        }
        System.out.println(st+" "+end);
        return max;
    }
}
