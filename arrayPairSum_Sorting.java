// Time Complexity : O(nlgn) where n is the length of the array nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class arrayPairSum_Sorting {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i+=2) {
            ans += nums[i];
        }
        return ans;
    }
}