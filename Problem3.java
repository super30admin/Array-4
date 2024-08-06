/* 
    LC - 31. Next Permutation
    TC - O(n)
    SC - O(1)
    Approach - 
        Discover the breach i.e. element which is smaller than the element to its right
        Discover an element which is just greater than the element at index i and swap
        reverse the part from i+1 to end of an array
*/

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        // Discover the breach i.e. element which is smaller than the element to its right
        int n = nums.length;
        int i= n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        // Discover an element which is just greater than the element at index i and swap
        if(i>=0) {
            int j = n-1;
            while(j>=0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // reverse the part from i+1 to end of an array
        reverse(nums, i+1, n-1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j) {
        while(i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}