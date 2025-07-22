// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : in order to make max pairs resulting in max sum, we need to group largest element with second largest element 
/// and so on. So let's sort array and find sum of alternating numbers

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0;i<nums.length;i+=2){
            res=res+nums[i];
        }
        return res;
    }
}