// Time Complexity : o(nlogn)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 561
//Approach : sort and skip i by 1

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length; i= i+2){
            sum+=nums[i];
        }
        return sum;
    }
}