// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length ==0)
            return;
        int n = nums.length;
        
        int i = n-2;
        
        while(i>=0&&nums[i]>=nums[i+1])
            i--;
        if(i>=0){
            int j = n-1;
            while(j>=0&&nums[i]>=nums[j])
                j--;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        int l = i+1;
        int h = n-1;
        while(l<=h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
}