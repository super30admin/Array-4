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
    private void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return ;
        int ptr = -1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                ptr = i;
                break;
            }
        }
        int start = 0;
        int end = nums.length-1;
        if(ptr != -1){
            for(int i = nums.length-1 ; i >  ptr ; i--){
                if(nums[i] > nums[ptr]){
                    swap(nums,i,ptr);
                    break;
                }
            }
            start = ptr+1;
            
        }
        while(start < end) swap(nums,start++,end--);
        
    }
}
