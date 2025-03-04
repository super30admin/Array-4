/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void nextPermutation(int[] nums) {
        //base
        if(nums.length == 0){
            return;
        }

        //variables
        int n = nums.length;

        //logic
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) { // Find the rightmost greater element
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i+1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i) {
        int j = nums.length-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}