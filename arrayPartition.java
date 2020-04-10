// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : After class solution


// Your code here along with comments explaining your approach
//Goal is to find the minimum. Therefore, sort them and iterate over the alternate values in array

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null) return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        
        for(int i=0; i<nums.length; i=i+2){
            sum += nums[i];
        }
        
        return sum;
    }
}