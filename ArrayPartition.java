// Time Complexity : O(n + nlogn) where n is the number of elements in the nums array and nlogn for sorting it
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
    	//sort the given array
        Arrays.sort(nums);
        int sum = 0;
        //iterate from the end and keep adding the min elements to sum
        for(int i=nums.length-1; i>=0; i=i-2)
        {
            sum = sum + Math.min(nums[i], nums[i-1]);
        }
        return sum;
    }
}