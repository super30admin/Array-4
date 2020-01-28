/**
LeetCode Submitted : No (178/256) test cases passed
Time Complexity : O(N)
Space Complexity : O(1)

The idea is to find first position where nums[i] > nums[i-1] from end of array and then swap. Also,look for other positions where swapping is possible. Will look for correct algorithm in class tomorrow.


**/

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length < 1)
            return;
        
        for(int i = nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                int temp  = nums[i];
                nums[i]   = nums[i-1];
                nums[i-1] = temp;
                return;
            }else{
                int temp  = nums[i];
                nums[i]   = nums[i-1];
                nums[i-1] = temp;
            }
        }
        
        Arrays.sort(nums);
    }
}
