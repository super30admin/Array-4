//Time complexity : O(n^2)
//Space complexity: O(1);


class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxNum = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                maxNum = Math.max(sum, maxNum);
            }
        }
        
        return maxNum;
    }
    

}