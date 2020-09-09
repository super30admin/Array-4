// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i >= 0) {
            int j=n-1;
            while(nums[j] <= nums[i])
                j--;
            
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    private void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
