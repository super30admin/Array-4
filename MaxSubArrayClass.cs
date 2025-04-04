// SC => O(n)
// TC => O(1)

public class Solution {
    public int MaxSubArray(int[] nums) {
        if(nums == null || nums.Length == 0){
            return 0;
        }

        int n = nums.Length, rSum = nums[0], max = nums[0];

        for(int i = 1; i < n; i++){
            rSum = Math.Max(rSum + nums[i], nums[i]);
            max = Math.Max(max, rSum);
        }

        return max;
    }
}