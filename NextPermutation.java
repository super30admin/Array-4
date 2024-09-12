// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach
public class NextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            if(nums.length == 1) return;//base case

            int i = nums.length-2;

            while(i >= 0 && nums[i] >= nums[i+1]){
                i--;
            }

            if(i>=0){
                int j = nums.length-1;
                while(j >= 0 && nums[i]>= nums[j]){
                    j--;
                }
                swap(nums, i, j);
            }
            reverse(nums, i+1);
        }

        //reverse beginning at the at the start value passed in
        private void reverse(int[] nums, int start){
            int j = nums.length-1;
            while(start < j){
                swap(nums, start, j);
                start++;
                j--;
            }
        }

        //swap values within the array
        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
