// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Find the breach: It finds the first element from the end that is smaller than the next element.
//Find and swap: If such an element is found, it finds the smallest element larger than it to the right, and swaps them.
//Reverse the suffix: Finally, it reverses the elements to the right of the found element to get the next permutation in lexicographical order.

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return ;
        }
        // Discover the breach i.e.,element which is smaller than element to its right
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        // Discouver the element which is just greater than the element at index i and swap
        if(i != -1){
            int j = n - 1;
            while( j >= 0&& nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        // Reverse the part from i+1 to end of the array
        reverse(nums, i+1, n-1);
    }

    private void reverse(int[] nums, int l, int r){
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}