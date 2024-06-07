// Time Complexity : O(3N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-2;
        // identify breach
        while(i >=0 && nums[i] >= nums[i+1]) {
            i--;
        }

        // swap with next bigger number
        if(i >=0){
            int j= n-1;

            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i,j);
        }

        // reverse numbers from last to the breach number
        reverse(nums, i+1, n-1);

    }

    private void reverse(int[] nums, int i,int j) {
        while(i < j ){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}