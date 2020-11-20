// Time Complexity: O(N)
// Space Complexity: O(1)
// Passed Leetcode

class Solution {
    
    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    
    public void reverse(int[] nums, int start, int end) {
        
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
        
    }
    
    public void nextPermutation(int[] nums) {
        
        if (nums.length <= 1)
            return;
        
        int i;
        for (i = nums.length - 2; i >= 0; i--)
        {
            if (nums[i] < nums[i + 1])
            {
                break;
            }
        }
        if (i >= 0)
        {
            int curr = nums[i];
            int j = i;
            while(j < nums.length - 1 && nums[i] < nums[j + 1])
                j++;
            swap(nums, i, j);
        }
        
        reverse(nums, i + 1, nums.length - 1);
        
        
        
    }
}