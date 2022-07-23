//time complexity : O(n) n = number of buildings
//space complexity : O(1)

class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int overallSum = nums[0];

        for(int i=1; i<nums.length; i++) {

            if(currentSum + nums[i] >= nums[i])
            {
                currentSum += nums[i];
            }
            else
            {
                currentSum = nums[i];
            }

            if(currentSum > overallSum)
            {
                overallSum = currentSum;
            }

        }

        return overallSum;

    }
}
