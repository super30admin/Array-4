/**
Time complexity - O(n) where n is the number of elements in array nums.
Space complexity - O(1) 
Approach - 
            1. Find the head of the longest decreasing subsequence [LDS head]. O(n) time
            2. Find the largest value (pivot) in the nums array which is not a part of LDS, this is nothing but the element to the left of LDS head. Because all elements to the left of LDS are strictly increasing. O(1) time.
            3. Find the smallest number greater than pivot in the longest decreasing subsequence's head. O(n)
            4. Swap pivot and index values. If we swap the pivot with the smallest element in the suffix that is greater than the pivot, then the prefix is minimally increased. O(1) time.
            5. Reverse the array from the LDS head to end of array to generate the next permutation. O(n) time.

            Special case - 1. entire array strictly increasing -> eg  1 2 3.
                              1. No LDS. index points to last element. 
                              2. pivot points to last but before element.
                              3. smallest number greater than pivot is last element itself.
                              4. swap index and pivot.
                              5. reverse method called on last element alone. No reversal required.
                              time - O(1)
                           
                           2. entire array is strictly decreasing -> 3 2 1
                                1. LDS index -> 0
                                2. pivot -> -1
                                3. reverse the entire array to get a strictly increasing array.
                                time - O(2 * n)
 */
class Solution {
    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int len = nums.length, index = len - 1, pivot = -1;

        while(index > 0 && nums[index] <= nums[index - 1])     //  <1>
            index--;
        
        if(index <= 0) {         //spl case - entire array is decreasing. Reverse the entire array.
            reverse(nums, 0);
            return;
        }else 
            pivot = index - 1;                  // <2>

        index = len - 1;                        //  <3> 
        while(index > pivot && nums[index] <= nums[pivot])
            index--;
         
        int temp = nums[index];                 // <4>
        nums[index] = nums[pivot];
        nums[pivot] = temp;

        reverse(nums, pivot + 1);               // <5>
    }
}
