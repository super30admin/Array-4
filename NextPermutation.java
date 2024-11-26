// TC: O(N), N-> no. of elements of nums array
// SC: O(1)
// Did it run successfully on Leetcode?: Yes
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        // find the index of first breach => nums[i] < nums[i+1]    ( loop from right to left)
        while ( i >= 0 && nums[i] >= nums[i+1])
        {
            i--;
        }
       // if index of first breach is greater than zero, then find the element just greater than the element at breached index by looping from right to left and swap the 2 elements [element at breached index AND element just greater than the element at breached index]
        if ( i >= 0)
        {
            int j = n-1;
            while ( nums[i] >= nums[j])
            {
                j--;
            }
            //swap
            swap(nums, i, j);
        }
        //reverse
        reverse(nums, i+1, n - 1);
        return;
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end)
    {
        while ( start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
