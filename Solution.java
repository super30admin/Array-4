//Time complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length ==0 || nums == null) return 0;
        int max =nums[0];
        int currSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currSum= Math.max(currSum + nums[i], nums[i]);
            max = Math.max(max,currSum);
    }return max;
}
}