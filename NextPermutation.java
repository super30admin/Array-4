// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        int i = n-2;
        // find breach
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        // find the number to swap from breached digit
        if(i >= 0) {
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        //get smallest digit from i+1;
        reverse(nums, i+1, n-1);
    }

    public void reverse(int[] nums, int l, int r) {
        while(l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}