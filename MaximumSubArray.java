// Time Complexity : O(n)
// Space Complexity :O(1)
//  n is the number of elements in given array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        //null check
        if(nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int max = nums[0];
        int currSum = nums[0];

        for(int i = 1 ; i < n ; i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            max = Math.max(max,currSum);
        }
        return max;
    }
}

//Follow - up question
// Give out the index of start and end sub-array
class Solution {
    public int maxSubArray(int[] nums) {
        //null check
        if(nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int max = nums[0];
        int currSum = nums[0];
        int currStart = 0;
        int start = 0;
        int end = 0;

        for(int i = 1 ; i < n ; i++){
            currSum = nums[i] + currSum;
            if(currSum < nums[i]){
                currStart = i;
                currSum = nums[i];
            }

            if(max < currSum){
                max = currSum;
                start = currStart;
                end = i;
            }
        }
        System.out.println(start+" "+ end);
        return max;
    }
}