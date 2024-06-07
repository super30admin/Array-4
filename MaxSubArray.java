// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int currSum =0;
        int start=0;
        int end =0;
        int currStart=0;
        for(int i=0;i< n;i++){
            currSum += nums[i];

            if(currSum < nums[i]){
                currSum = nums[i];
                currStart = i;
            }

            if(max < currSum){
                max = currSum;
                start = currStart;
                end = i;
            }

        }
        System.out.println("start::"+ start +" end::"+end);

        return max;
    }
}