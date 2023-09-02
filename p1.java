// Time Complexity :O(nlog(n))
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


class Solution {
    public int arrayPairSum(int[] nums) {
        //Sort the array
        Arrays.sort(nums);
        int sum = 0;
        //get the alternate numbers
        for(int i=0; i<nums.length; i = i+2){
            sum = sum + nums[i];
        }
        return sum;
    }
}