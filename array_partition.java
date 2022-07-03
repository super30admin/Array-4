// Time Complexity :O(nlogn)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes


class Solution {
    public int arrayPairSum(int[] nums) {
        // sort the array
        Arrays.sort(nums);
        int result = 0;
        // make pairs starting from index 0 and add min of pair in result
        for (int i = 0; i < nums.length; i += 2) {
            result += Math.min(nums[i], nums[i + 1]);
        }
        return result;
    }
}