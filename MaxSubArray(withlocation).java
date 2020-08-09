class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int k = 0 ;//curr array
        int rSum = 0;
        for(int i = 0; i < nums.length; i++){
            rSum = rSum+nums[i];
            if(rSum < nums[i]){
                k = i;
                rSum = nums[i];
            }
            if(max <rSum){
                max = rSum;
                start = k;
                end = i;
            } 
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}