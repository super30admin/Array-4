// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
We first start from end part of the input array to identify the index where breach is happening.Ideally, all the
elements should be in increasing order as we go towards left.The index where the pattern breaks is the point of
breach.Now, we need to check what is the immediate bigger number than this breached number.So, we start again
from the right to check which number is bigger.Once we identify, we break the loop and swap the i and j numbers.
Now,we need to have the overall permutation, so, reverse the number just after the breached index till the
end of the array.
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // identify the breach by getting index of that element
        while(i >= 0 && nums[i] >= nums[i + 1])
            i--;

        if(i >= 0) {
            int j = n - 1;
            while(nums[j] <= nums[i])
                j--;
            swap(nums, i , j);
        }
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while(i < j) {
            swap(nums,i, j);
            i++;
            j--;
        }
    }
}