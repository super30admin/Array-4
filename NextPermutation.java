// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : We traverse the array from the end and find the first decreasing element and capture. This tells that, the suffix of the number is already largest
// possible. Now swap the decreasing element with next greater number so that it gives the next permutation. In the final step, we need to reverse the suffix
// so that it gives the smallest number as we already increased the prior digit's place.

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int indexToBeSwapped = -1;
        for (int i = n - 2; i >= 0; i--) { // find the index to be Swapped with nums[i] < nums[i+1] check
            if (nums[i] < nums[i + 1]) {
                indexToBeSwapped = i;
                break;
            }
        }

        if (indexToBeSwapped != -1) {  //if indexToBeSwapped is found, find next greater number and swap
            for (int j = n - 1; j > indexToBeSwapped; j--) {
                if (nums[j] > nums[indexToBeSwapped]) {
                    swap(nums, j, indexToBeSwapped);
                    break;
                }
            }
        }

        int l = indexToBeSwapped + 1, r = n - 1; //reverse the rest of the elements
        while (l < r) {
            swap(nums, l++, r--);
        }
    }

    private void swap(int[] a, int i, int j) { //swap function
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
