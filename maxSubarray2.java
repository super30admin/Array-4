//suppose we were asked to return the indices of the contiguous array
//tc and sc: same as prev solution

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int rSum = nums[0];
        int max = nums[0];
        int start = 0, end = 0, curStart = 0;
        
        
        for(int i = 1; i < nums.length; i++) {
            //rSum = Math.max(rSum + nums[i], nums[i]);
            //max = Math.max(max, rSum);
            if(nums[i] < rSum + nums[i]) {
                rSum = rSum + nums[i];
            }
            else {
                rSum = nums[i];
                //curStart = i;
                start = i;
            }
            if(max < rSum) {
                max = rSum;
                end = i;
                //start = curStart;
            }
        }
        System.out.println("start : " + start + " end : " + end);
        return max;
    }
}