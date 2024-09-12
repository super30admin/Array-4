// Time Complexity : O(nlogn) n is number of elements in input
// Space Complexity : O(1) Constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Brute-force is applying backtracking to track all the possible combinations to form the pairs and adding the all minimums of each pairs and compare to get the max of it.
//As it will cost of O(n^n), apply simple logic of sorting the given array.
// Now we know, we know we have smallest element at 0th index.
// start adding from there till the end alternatively, as they are all the minimums in pairs and return sum.

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i< nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}