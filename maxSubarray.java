// Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, take currMax as nums[0] and max as nums[0]. Start from index 1 to n and at each iteration find currMax as max between currMax+nums[i]
 * and nums[i] and max as max between prev max and currMax. Finally return max.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int max = nums[0];
        int startPoint = 0;
        int start = 0, end = 0;
        for(int i = 1; i < nums.length; i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            if(currMax == nums[i]){
                startPoint = i;
            }
            if(currMax > max){
                max = currMax;
                start = startPoint;
                end = i;
            }
            
        }
        System.out.print(start);
        System.out.print(end);
        return max;
    }
}
