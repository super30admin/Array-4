//Time Complexity: O(N) where N is the length of nums array
//Space Complexigy: O(1)

//Successfully runs on leetcode: 0 ms

//Approach: From the second last element in nums array, try to find the condition where the prev element is less than the current
//element, swap that element with the next big element in the array and from the point of the swap, reverse the whole array-
//this will give the next permutation.

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int i = n - 2;
        
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        
        if(i >= 0)
        {
            int j = n - 1;
            while(nums[i] >= nums[j])
                j--;
            swap(nums, i, j);   
        }
        reverse(nums, i+1, n-1);
    }
    
    private void reverse(int[] nums, int i, int j)
    {
        while(i <= j)
        {
            swap(nums, i, j);
            i++; j--;
        }
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}