// Recursive Solution : TLE O(2^n)
 class Solution {
     public int maxSubArray(int[] nums) {
         return helper(nums, 0, 0, Integer.MIN_VALUE);
     }

     private int helper(int[] nums, int i, int curSum, int max) {

         if(i==nums.length){
             return max;
         }

         int case1 =  helper(nums, i+1, curSum + nums[i], Math.max(max, curSum+ nums[i]));
         int case2 =  helper(nums, i+1, 0, max);

         return Math.max(case1, case2);

     }
 }

// Time COmplexity: O(n)
// Space COmplexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int local = nums[0];
        int global = nums[0];

        for(int i = 1; i < nums.length; i++) {
            local = Math.max(nums[i], local + nums[i]);
            global = Math.max(local, global);
        }
        return global;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
 class Solution {
     public int maxSubArray(int[] nums) {
             int max = nums[0];
             for(int i=1; i<nums.length; i++) {
                if(nums[i-1]>0) {
                    nums[i] += nums[i-1];
                }
                 max= Math.max(nums[i], max);
             }
         return max;
     }
 }

