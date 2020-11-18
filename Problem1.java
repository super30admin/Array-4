// Time Complexity: O(N log(N))
// Space Complexity: O(1)
// Passed Leetcode

class Solution {
    public int arrayPairSum(int[] nums) {
        
        if (nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int total = 0;
        
        for (int i = 0; i < nums.length - 1; i += 2) {
            total = total + Math.min(nums[i], nums[i + 1]);    
        }
        
        return total;
    }
}