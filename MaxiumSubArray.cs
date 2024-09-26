//Time: O(n)
//Space: O(1)
//leetcode: https://leetcode.com/submissions/detail/651328582/
public class Solution {
    // [-2,1,-3,4,-1,2,1,-5,4]
    public int MaxSubArray(int[] nums) {
       
        int length = nums.Length;
        int j=0;
        int sum = 0;
        int maxSum = Int32.MinValue;
        while(j < length) {
            
            sum += nums[j];
            maxSum = Math.Max(sum , maxSum);
            if(sum < 0) {
                sum = 0;
            }
            j++;
        }
        return maxSum;
    }
}