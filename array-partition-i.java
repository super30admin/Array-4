// Time Complexity : O(nlogn)
// Space Complexity : O(logn) used during sorting
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// sort nums and add alternate element.

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int index = 1; index<nums.length;index+=2){
            sum+=nums[index-1];
        }
        return sum;
    }
}