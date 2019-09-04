//TC: O(n)
//SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int runningSum =0;
        int max=0;
        for(int i=0;i<nums.length; i++){
            runningSum += nums[i];
            if(runningSum < 0) runningSum = 0;
            max = Math.max(max,runningSum);
        }
        if(max == 0 ) return calculaterMax(nums);
        return max;
        
    }
    private int calculaterMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++){
          max = Math.max(max,nums[i]);
        }
        return max;
    }
}
