// Time Complexity: O(n log n)
// Space Complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Sort in ascending order
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];  // Always pick the smaller of the two in each pair
        }
        return sum;
    }
}
