// Time Complexity : O(NlogN) - As we sort the whole array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i< nums.length;i = i + 2){
            int num1 = Math.min(nums[i],nums[i+1]);
            sum = sum + num1;
        }
        return sum;
    }
}
// Your code here along with comments explaining your approach