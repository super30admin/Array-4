/*
 * #31. Next Permutation
 * 
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]

Example 4:

Input: nums = [1]
Output: [1]
 

Constraints:

1. 1 <= nums.length <= 100
2. 0 <= nums[i] <= 100

 */

/*
 * Time Complexity: O (N) -> Traversing the array to find peak index, peak element and reverse the array after peak index, all sums up to O (N)
 * 
 * Space Complexity: O (1) -> No extra space used
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.array4;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        /*
        Steps:
        *   1. Find the peak index, position where number will change to get next premutation
        *       - To find peak index, we start from right. If we start from left we would not get correct next greater permutation of numbers
        *   2. If peak index found, find the peak element -> element to replace peak index's element with, else execute 4th step directly 
        *   3. Swap the peak index element and peak element
        *   4. Reverse the remaining numbers in array after peak index 
        */
        
        // #1. Base condition
        if(nums == null || nums.length == 0){
            return;
        }
        
        // #2. Initialize the 'peak_index' and 'peak_element' variables
        int peak_index = nums.length - 2;
        int peak_element = nums.length - 1;
        
        // #3. Find the peak index, position where we will change a number to get next greater permutation
        while(peak_index >= 0 && nums[peak_index] >= nums[peak_index + 1]){
            peak_index--;
        }
        
        /*
        *   Peak element -> It should be greater than element at peak index
        */
        // #4. If peak index is found, Find the peak element
        if(peak_index >= 0){   // e.g: nums = [3,2,1] -> In this example, cannot find peak index (-ve peak index)
            while(peak_element >= 0 && nums[peak_element] <= nums[peak_index]){
                peak_element--;
            }
            
            swap(nums, peak_index, peak_element);
        }
        
        // #5. Reverse the array after peak_index element
        reverse(nums, peak_index + 1, nums.length - 1);
        
        
    }
    
    // swap function
        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        // reverse function
        public void reverse(int[] nums, int start, int end){
            while(start < end){
                swap(nums, start, end);
                start++;
                end--;
            }
             
        }
    
}
