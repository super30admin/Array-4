// Time Complexity : O(n)
// Space Complexity : O(1)
//  n is the number of elements in given array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        //null check
        if(nums == null)
            return;

        int n = nums.length;
        int i = n-2;

        //1. Find breach
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //2. Find digit to be swapped with and Swap i and j
        if(i != -1){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }

        //3. Reverse from i+1
        reverse(nums, i+1 , n-1);
    }

    private void reverse(int[] nums, int l, int r){
        while(l <r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
