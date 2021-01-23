// Time Complexity :O(Nlog N) 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:After sorting the array, to find the maximum sum, we need to add the sum of
// every alternate element as we will be having maximum sum when we pair 2 adjacent elements after sorting.
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}