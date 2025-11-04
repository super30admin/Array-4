/*
* Approach 1: 
    - BF: at every index, create subarrays and iterate over those subarrays to find the max
    TC: O(n^3) -> n^2 for creating the subarrays and going over the n^2 subarrays

* Approach 2: Use two pointers
- The idea is to check for currSum and maxSum at every index
- initialize currSum and maxSum by the first element and iterate from the 1st index
- at every index, take the max between the current element or previous currSum and current element
- TC: O(n) -> iterating over the array
- SC: O(1) -> no additional space required

 - Follow up: Starting and ending indices of the maxsubarray
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        int start = 0;
        int end = 0;

        //currStart to track currStart and not the maxSubarray start
        int currStart = 0;

        // max subarray depends on max variable so updating start when currSum changes should be a red flag!!!

        for(int i = 1; i < nums.length; i++){
            currSum += nums[i];
            if(nums[i] > currSum){
                currSum = nums[i];
                currStart = i;
                // start = i; v tempting but incorrect
            }
            // maxSum = Math.max(maxSum, currSum);
            if(currSum > maxSum){
                maxSum = currSum;
                start = currStart; //update only if the max has changed
                end = i;
            }
        }
        System.out.println("Start " + start + " end " + end);
        return maxSum;
    }
}