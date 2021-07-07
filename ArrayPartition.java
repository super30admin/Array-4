/**
LeetCode Submitted : YES
Space Complexity : O(1)
Time Complexity : O(N)

The idea is to sort the array and take pair in consecutive manner till we reach end of array. At each pait take min and add it to sum.

**/

class Solution {
    public int arrayPairSum(int[] nums) {
        
        if(nums == null || nums.length < 1)
            return 0;
        
        Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i =0; i<nums.length;i=i+2){
            sum += Math.min(nums[i],nums[i+1]);    
        }
        
        return sum;
    }
}
