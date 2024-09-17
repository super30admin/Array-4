// Time complexity - 0(n)
// space complexity - 0(1)
// here in this Solution local variable is used to iterate whole array and it also checks max values between index and loacl+ index, returing 
// the max of them and compare with global values and updating it accordingly. 

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int local =  nums[0];
        int global = nums[0];
        for(int i=1;i<nums.length;i++){
            local = Math.max(nums[i]+local,nums[i]);
            global = Math.max(global,local);
        }
        return global;
    }
}