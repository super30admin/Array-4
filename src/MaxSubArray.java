// Time Complexity : each operation O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//https://leetcode.com/problems/maximum-subarray/submissions/
class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int rSum = 0, max = Integer.MIN_VALUE;
        int k=0, start =0, end = 0;
        
        for (int i=0 ; i< nums.length; i++) {
            //check if num[i] leads to better running sum
            if(rSum + nums[i] > nums[i]) {
                rSum+=nums[i];
            }else { //else only select num[i] i.e. start continous array at i
                rSum = nums[i];
                k = i;
            }
            
            //find the max sum and record start and end points of the continous array
            if(rSum > max){
                max = rSum;
                start = k;
                end = i;
            }
        }
        
        System.out.println("Start " + k + " end " + end);
        return max;
    }
}