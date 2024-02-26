class Solution {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int msf = 0;

        for(int num : nums){
            max = Math.max(msf + num, max);
            if(num + msf < 0){
                msf = 0;
            } else {
                msf = msf + num;
            }
        }

        return max;
        
    }
}
