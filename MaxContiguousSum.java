/*
Time: O(N)
Space: O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        //Base case:
        if(nums==null || nums.length==0){
            return 0;
        }
        //Logic:
        int n = nums.length;
        int max = nums[0];
        int rSum = nums[0];
        // System.out.println(max);
        for(int i=1; i<n; i++){
            // rSum = rSum + nums[i]; 
            //Take decesion: cumulative sum or new value from nums
            rSum = Math.max(rSum+nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        
        return max;
        
        
    }
}
