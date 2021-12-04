//Time complexity:- O(n).
//space complexity :- O(1).
//Did it run on leetcode:- Yes.
//Your code with approach:- As main goal is to find largest sum of contiguos array , we will be having 
//optimal common sub structure so dp has been implemented considering one element and so on.

class Solution {
    public int maxSubArray(int[] nums) {
        int total=0;
        int dp=nums[0];
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
            total=Math.max(total,nums[i]);
            dp=Math.max(dp,total);
        }
        return dp;
    }
}