// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        
        int ms = Integer.MIN_VALUE;
        int s = 0;
        for(int n: nums) {
            
            s += n; 
            if(ms < s) ms = s;
            if(s<0) s=0;
            
        }
        return ms;
    }
}
