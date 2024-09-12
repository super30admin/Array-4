/*
Time: O(N)
Space: O(N)
Approach:
=========
1. Get index of first decreasing element from right (i)
2. Now, get element from right which is greater than value at index i 
3. Swapping them both and reversing the list from  i+1th index gives next permutation
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2; 
        
        // get index where value at higher index is greater than lower index value
        while(i >= 0 && nums[i+1] <= nums[i]) {
            i--;
        }
        
        // Get index of number greater than value at index i
        if(i >= 0) {
            int j = nums.length - 1;
            while( j >= 0 && nums[j] <= nums[i])
                j--;
            // swap both
            swap(nums,i, j); 
        }
        //reverse from that index to get next permutation
        reverse(nums, i+1); 
    }
    
    private void reverse (int[] nums, int start) {
        int i = start, j = nums.length - 1; 
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}