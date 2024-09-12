//Time Complexity:O(N)

//SPace Complexity:O(1)
class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currSum = currSum + nums[i];

            if (maxSum < currSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }
}