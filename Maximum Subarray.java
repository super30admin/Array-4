// Time Complexity : O(n); where n = size of the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxSubArray(int[] nums) {

    int currentSum = nums[0];
    int max = nums[0];
    int start = 0;
    int end = 0;
    int currStart = 0;
        
    for(int i = 1; i < nums.length; i++){
        if(currentSum + nums[i] < nums[i]){
            currStart = i;
            currentSum = nums[i];
        } else{
            currentSum = currentSum + nums[i];
        }
        
        if(max < currentSum){
            start = currStart;
            end = i;
            max = currentSum;
        }
    }
    
        // System.out.println(start);
        // System.out.println(end);
        // System.out.println(currStart);

        return max;
        
    }
}