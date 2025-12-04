// 31. Next Permutation
// https://leetcode.com/problems/next-permutation/description/

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void nextPermutation(int[] nums) {
        
        // find breach
        int i = nums.length - 2;

        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }

        // find just greater number
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}