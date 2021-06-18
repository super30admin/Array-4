// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int curr = nums[0];
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            curr = Math.max(curr+nums[i],nums[i]);
            max = Math.max(max,curr);
            
        }
        return max;
    }
}
