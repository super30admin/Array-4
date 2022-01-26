// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * We iterate over array and keep rsum.
 * For each element, we keep track of which one is greater rsum + nums[i] or nums[i].
 * once we get max between them, we also update sum with maximum between sum or max between above.
 * This allows us to get maximum sum that can be formed between array
*/


class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null  nums.length == 0)return 0;
        
        return bruteForce(nums);
        
        int sum = nums[0];
        int temp = nums[0];
        for(int i = 1; i  nums.length;i++){
            temp = Math.max(temp + nums[i], nums[i]);
            sum = Math.max(sum, temp);
        }
        
        return sum;
    }
    
    private int bruteForce(int[] nums){
        int sum = nums[0];
        
        for(int i = 0; i  nums.length;i++){
            int temp = nums[i];
            sum = Math.max(sum, temp);
            for(int j = i+1; j  nums.length;j++){
                temp = temp + nums[j];
                sum = Math.max(sum, temp);
            }
        }
        
        return sum;
    }
}