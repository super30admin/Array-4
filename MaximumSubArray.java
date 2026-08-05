/**
 * Time Complexity:  O(n)  where n is length of nums
 * Space Complexity: O(1)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int runningSum = 0;

        for(int i=0; i<nums.length; i++){
            if(runningSum + nums[i] >  nums[i]){
                runningSum+=nums[i];
            }else{
                runningSum = nums[i];
            }

            result = Math.max(result, runningSum);
        }

        return result;

    }
}