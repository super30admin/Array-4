// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
//Example 2,4,7,6,5,3,1
// Find a breach - 4 in the example (elements to right are in descending order)
// Swap i with the element closest to it if breached  -> 2,5,7,6,4,3,1
// Reverse from i+1 to n -> 2,5,1,3,4,6,7


class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        //Find breach
        int i = n - 2;
        while(i >=0 && nums[i] >= nums[i+1] ){
            i--;
        }

        //Swap  with next

        if(i >= 0) {
            int j = n-1;
            while(nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        //Reverse from i+1
        reverse(nums,i+1,n-1);


    }

    private void reverse(int[] nums, int i, int j) {
        while(i <= j) {
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
