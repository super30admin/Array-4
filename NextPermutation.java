//Time Complexity: O(n)
//Space Complexity: O(1)

/*
 * find the breach from the back where the elements anre not in decending order.
 * swap it with the number greater than that and reverse the 
 * list from that element.
 */

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int n = nums.length;
        int i = n-2;
        //found breach
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //swap the elements
        if(i >= 0){
            int j = n-1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        //reverse
        reverse(nums, i+1, n-1);
    }

    public void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++; r--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}