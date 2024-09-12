// Time Complexity : O(n) n is number of elements in the input array
// Space Complexity : O(1) constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Using Kadane's or Greedy Algorithm, we can optimize the sum at each index while adding forward.
// start with the 0th  index, add it to the sum and then to max sum.
// at 1st index, find the max of current element and prev sum. whichever sum is maximum, compare with the max and store the max of both to the max sum.
// continue this comparisions till the end of the array and return max sum.

class Solution {
    public int maxSubArray(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}