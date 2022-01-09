// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Take start variable and max variable, innitialize with zero indexed value. for start check for max value of new value and start + new value. and max will be the max between max and start.
// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int start = nums[0];
        int max = nums[0];
        int startIndex = 0;
        int endIndex = 0;
        int currIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(start+nums[i]<nums[i]){
                start = nums[i];
                currIndex = i;
            }else{
                start = start+nums[i];
            }
            if(max < start){
                max = start;
                startIndex = currIndex;
                endIndex = i;
            }
        }
        System.out.println("Start Index "+startIndex);
        System.out.println("End Index "+endIndex);
        return max;
    }
}