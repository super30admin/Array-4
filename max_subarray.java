// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==1) return nums[0];
        int sum = nums[0],check = nums[0] ,i=1;
        while(i<nums.length){
            if((sum)>0) sum = sum+nums[i];
            else sum = nums[i];
            if(sum>=check) check = sum;
            i++;
        }
        return check;
    }
}