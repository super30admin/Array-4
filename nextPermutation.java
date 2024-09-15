// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    1. Loop from the back and find the number that's smaller than the one after it.
    2. Find the number that's smaller that that numbe rfrom behind and swap them
    3. Reverse the remaining part in between the two numbers
*/


// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int breach = -1;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if(nums[end] < nums[end+1]) {
                breach = end;
                break;
            }
            else
                end --;
            
        }
        if (breach == -1){
            swap(0, nums.length - 1, nums);
            return;
        }
        else {
            int j = nums.length - 1;
            while(nums[breach] >= nums[j]) {
                j --;
            }
            int temp = nums[breach];
            nums[breach] = nums[j];
            nums[j] = temp;
            swap(breach + 1, nums.length-1, nums);
        }
    }

    private void swap(int start, int end, int[] nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
} 
