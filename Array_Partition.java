/*
 * TC: O(nlogn) n: length of nums. The Sorting of nums[] dominates the Time complexity.
 * SC: O(1) constant space.
 * 
 * Approach: Sort the array and add elements at even indexes to the result.so that we can maximize the sum.
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;

        for(int i = 0; i < nums.length ; i += 2)
            result += nums[i];
        
    return result;
    }
}