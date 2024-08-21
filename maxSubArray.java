/*
Brute force is O(n^2)
Kadane's algorithm TC --> O(n)
SC --> O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int sum_val = 0;
        int max_sum = nums[0];
        for(int i=0;i<nums.length;i++){
            sum_val+=nums[i];
            max_sum = Math.max(max_sum, sum_val);
            if(sum_val<0){
                sum_val = 0;
            }
        }//for
        return max_sum;
    }//method
}//class