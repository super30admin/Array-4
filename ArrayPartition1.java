// Time Complexity :  O(Nlog N)  // N log N avg case, worst case O(N^2) - inbuilt uses quick sort
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode :Yes

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // space complexity for this is logN 
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i = i + 2){
            ans += nums[i];
        }
        return ans;
    }
}