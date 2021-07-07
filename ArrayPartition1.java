// Time Complexity : O(nlogn) n -> no of integers
// Space Complexity : O(logn) stack space used for sorting
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: To get maximum sum out of minimum combinations, we need to try to choose the maximum possible element. 
// Since in a pair we are allowed to choose the minimum one, we need to reduce the compensation of not choosing the larger value. To attain this, the difference between the elements in a pair must be least.
// Therefore, sorting the array and choosing alternate elements starting at index 0 will serve the purpose.

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i+2) {
            sum += nums[i];
        }
        return sum;
    }
}



