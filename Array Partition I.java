// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
        //edge
        if(nums == null || nums.length == 0) return 0;
        //set the sum
        int sum = 0;
        //sort the array
        Arrays.sort(nums);
        //loop through the array
        for(int i = 0; i < nums.length; i = i+2){
            //just add the sums
            sum += nums[i];
        }
        return sum;
    }
}