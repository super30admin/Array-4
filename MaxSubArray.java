// two solutions possible
// 1. brute force  - TC - O(n^2). fix an element as a pivot and iterate over the rest. find the max sum across all the possible combinations.
// 2. running sum - maintain a rSum(which is the currSum) and the maxSum.
// The idea is that the new addition is gonna increase the currSum or the new element is better than having the new addition in an existing array.
// Then check whether this new curr sum is greater than the maxSum.
// Time complexity = O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        // why not 0, since if all the elements are -ve, then 0 is like the incorrect sum.
        int currSum=nums[0];
        int maxSum = nums[0];
        int start = 0;
        int end = 0;
        int currStart = 0;
        int currEnd = 0; 
        for(int i=1;i< nums.length;i++) {
            // currSum = Math.max(currSum+ nums[i], nums[i]);
            if(currSum + nums[i] > nums[i] ) {
                currSum = currSum + nums[i];
                currEnd  = i;
            } else {
                currSum = nums[i];
                currStart = i;
                currEnd = i;
            }
            // maxSum = Math.max(maxSum, currSum);
            if(currSum > maxSum ) {
                maxSum = currSum;
                start = currStart;
                end = currEnd;

            }

        }
        System.out.println(start);
        System.out.println(end);
        return maxSum;
        
    }
}


// now let's start with finding the start index and end Index of maxSum.
// we need 4 variables-> start and end <- the indexes of the maxSum
// and currStart and currEnd <- the indexes of the currSum
// They need not be necessary same. 