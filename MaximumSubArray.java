// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yess
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int max= nums[0];
        int sum=0;
        for(int i=0; i<n;i++){
            sum=sum+nums[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;
            
        }
        return max;
    }
    
}