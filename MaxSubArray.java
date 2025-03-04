/**
 * Time Complexity: 
 * Space Complexity: 
 * Did this code successfully run on Leetcode: Yes/No
 * Any problem you faced while coding this: None

 * Approach:
 * Explain your approach here.
 */

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
    
    public static void main(String[] args) {
        // Your code here
    }
}