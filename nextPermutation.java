/* Time complexity: O(n)
space complexity: O(1)
*/

class Solution{
    public int maxSubArray(int[] nums){
        if(nums == null || nums.lenth == 0) return 0;
        int start = 0; int end = 0;
        int max = nums[0]; int rSum = nums[0]; int k = 0;
        for(int i = 1; i<  nums.length; i++){
            rSum += nums[i];
            if(nums[i] > rSum){
                rSum = nums[i];
                k = i;
            }
            if(rSum > max){
                max = rSum;
                start = k; end = i;
            }
        }
        return max;
    }
}