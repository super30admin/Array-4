// Time complexity: O(nlogn)
// Space complexity: O(1)

// Approach: We sort the array to bring all elements that are close to each other, together. So that we don't waste the higher value. We then add all elements at even indexes to the result

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            maxSum += nums[i];
        }
        return maxSum;
    }
}