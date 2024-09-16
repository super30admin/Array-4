//tc: o(n) sc: o(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int n = nums.length;
        //Step 1 : Finding the breach i.e an element which is smaller than the next element
        
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        //Step 2 : Find the element which is just greater than the element you found in step one
        int j = n - 1;
        if(i >= 0) {
            while(j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        //Step 3 : reverse the part from i + 1 to the end
        reverse(nums, i + 1, n - 1);
    }
    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    
    private void reverse(int[] nums, int l, int r) {
        while(l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}