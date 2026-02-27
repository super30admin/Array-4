/**
    Time Complexity : O(N)
    Explanation:
    1) Scan from right to find first decreasing index i  -> O(N)
    2) Scan from right to find next bigger element j     -> O(N)
    3) Reverse the suffix after i                        -> O(N)
    Overall still O(N).

    Space Complexity : O(1)
    Explanation:
    All operations are done in-place (swap + reverse).

    Did this code successfully run on LeetCode : Yes

    Any problem you faced while coding this :
    Initially got confused about the pivot index 'i' (first drop from right).
    Also made mistakes choosing the correct element to swap.
    Fixed it by always picking the first element from the right that is
    greater than nums[i], then reversing the suffix to make it smallest.
    */

    class Solution {

    
        public void nextPermutation(int[] nums) {
    
            int n = nums.length;
            if (n < 2) return;
    
            // Step 1: find pivot (first index from right where nums[i] < nums[i+1])
            int i = n - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }
    
            // Step 2: if pivot exists, find rightmost element greater than pivot and swap
            if (i >= 0) {
                int j = n - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }
    
            // Step 3: reverse the suffix to get the next smallest arrangement
            reverse(nums, i + 1);
        }
    
        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
        private void reverse(int[] nums, int start) {
            int i = start, j = nums.length - 1;
            while (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
    }