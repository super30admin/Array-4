// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {

        // we have to find the next permutation following lexographic order
        // we need to find the disruptor here which is when nums[i] < nums[i + 1]:: Here we go in reverse dir
        //:: In that case all the nums before
        // and nums[i] are placed properly.
        // now next lexograpy is finding the num greater than nums[i] and swap it

        // Find nums[i] where nums[i] < nums[i + 1]

        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i] < nums[i + 1]) break;
            i--;
        }

        // we found i;
        // if  i < 0 // we need to reverse all and return
        if (i < 0) {
            i = 0;
            int j = nums.length - 1;
            while (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
            return;
        }

        // At this point we have i. scan from the end. Find number greater than nums[i] and swap it
        int z = nums.length - 1;
        while (z >= 0) {
            if (nums[z] > nums[i]) break;
            z--;
        }

        // swap i and z
        swap(nums, i, z);

        // reverse from i + 1 to end
        i = i + 1;
        z = nums.length - 1;

        while (i <= z) {
            swap(nums, i, z);
            i++;
            z--;
        }

    }
}