// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 53
//Approach : window

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int sum = nums[0] ; 
        int currSum = nums[0] ;
        int st =0 ,end =0;
        int currSt = 0 ;
        for(int i = 1 ; i< nums.length; i++){
            if(nums[i] + currSum <= nums[i]){
                currSum = nums[i];
                currSt = i;
            } 
            else{
                 currSum += nums[i];
            }
            if(currSum>sum){
                sum = Math.max(sum,currSum) ; 
                st = currSt;
                end = i;
            }                  
        }
        System.out.println(st);
        System.out.println(end);
        return sum;
    }
}