// Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, start from end of the array and when element at i is less than element at i+1 then swap the element at i with number just greaterthan
 * element at i and reverse the number from i+1 to n-1.
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j = n-1;
        if(i>=0){
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
