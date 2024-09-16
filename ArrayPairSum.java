// Time Complexity : O(N*Log(N))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Nope.


// Your code here along with comments explaining your approach

class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i=i+2){
            sum += Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}