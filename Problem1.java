// Time complexity: O(nlogn)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
        int result =0;
       int n=nums.length;
       for(int i=0;i<n;i=i+2){
           result +=nums[i];
       }
        return result;
    }
}