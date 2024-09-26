//Time Complexity: O(n)
//Space Complexity: o(1)
//Expln: Keep on adding next element until sum is greater than next element but add to result only the max.
// if next element is -5 and curr max is 6 adding is 1 > -5 but result is max between 6 and 1 which will be same.
class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int result =0;
        if(nums.length ==0) return result;
        for(int i =0; i < nums.length; i++)
        {
            if(i == 0) {
                result = nums[i];
                max = result;
            }
            else if(nums[i] > max+nums[i])
            {
                max = nums[i];
            }
            else{
                max = max + nums[i];
            }
            result = Math.max(max, result);
        }
        return result;
    }
}