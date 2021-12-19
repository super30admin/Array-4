// 53 Maximum Subarray
// Time - O(n)
// Space - O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int greedy = 0;
        int smart = nums[0];
        
        for(int i = 0; i < nums.length; i ++){
            greedy = greedy + nums[i];
            smart = Math.max(smart, greedy);
            if(greedy < 0){
                greedy = 0;
            }
        }
        
        return smart;
    }
}