/*
* Approach 1: One way is to create all the permutations, sort the permutations, iterate through them and then find the next permutation.
TC for that approach will be exponential

Approach2: 
    - As we have to find the next permutation, we can iterate through the array from back and see if we have any strictly greater element than the current element
    - if such element exists, swap it with the current element as thats where the breach has happened
    - lastly reverse the array from the breach + 1 element to the end
- TC: O(n) -> iterate through the array and reversing the array
- SC: O(1) -> no additional space used
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        //keep iterating over the array until the breach is found
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        //find the next greater element to swap only if next greater permutation is available
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}