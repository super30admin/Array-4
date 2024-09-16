// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// sort the given array to neglect the lowest term then take the min which is starting from the index
// Your code here along with comments explaining your approach
class Solution {
    public int arrayPairSum(int[] nums) {
        if( nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}