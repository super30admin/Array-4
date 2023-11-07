// ## Problem1 Array partition (https://leetcode.com/problems/array-partition/)



// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// To get the maximum value, we need to minimize loss in every pair. This can be done by taking pairs with least difference, that can be identified in sorted array neightbours. 

class Solution {
    public int arrayPairSum(int[] nums) {

        if( nums == null || nums.length==0)
        {
            return 0;
        }

        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
        return sum;
        
    }
}