/*
 * tc - o(n)
 * sc - o(1)
 */

public class maxSubarray{
     //o(n) - sliding window
     public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];
        int start = 0, end = 0;
        int currStart = 0;
        for(int i = 1; i < n; i++){
            if(currSum + nums[i] < nums[i]){
                //changing the i
                currStart = i;
            }
            currSum = Math.max(currSum + nums[i], nums[i]);
            if(maxSum < currSum){
                start = currStart;
                end = i;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(start + " " + end);
        return maxSum;
    }
}