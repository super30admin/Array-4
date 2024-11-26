// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Running sum
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rSum = nums[0];
        int max = nums[0];
        
        for(int i=1; i< nums.length; i++){
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}

// *****************************************

// follow up qn -> return sub array:
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rSum = nums[0];
        int max = nums[0];
        int start = 0; int end = 0;
        int currStart = 0;
        for(int i=1; i< nums.length; i++){
            // rSum = Math.max(rSum + nums[i], nums[i]);
            if(nums[i] > rSum + nums[i]){
                rSum = nums[i];
                currStart = i;
            } else{
                rSum = rSum + nums[i];
            }
            if(max < rSum){
                max = rSum;
                end = i;
                start = currStart;
            }
        }
        System.out.println(nums[start]);
        System.out.println(nums[end]);
        return max;
    }
}