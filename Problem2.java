// Time Complexity - O(n) where n is the number of elements in the array  since we are traversing through the array once
// Space Complexity - O(1) 
// This solution worked on LeetCode


class Solution {
    public int maxSubArray(int[] nums) {
        //Edge Case
        if(nums == null  || nums.length ==0)    return 0;
        int sum =nums[0];   // Initiate the sum and max with the first element of the array
        int max = sum;      // Sum variable will hold the local maximum sum and max variable is used as global maximum sum
        for(int i=1;i<nums.length;i++){
            sum = Math.max(nums[i],nums[i]+sum);  // if the new number is greater than the sum so far + new number, then replace the sum with new number; that is the subarray starts from new number otherwise continue the subarray
            max = Math.max(sum,max);  // if the global maximum is less than the sum , replace the max; the subarray end can be recorded here if subarray length of subarray itself needs to be returned.
        }
        return max;   // return the global maximum
    }
}
