//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr=Math.max(nums[i],curr+nums[i]);//current continous max seen so far
            max=Math.max(max,curr);//overall max
        }
        return max;
        
    }
}