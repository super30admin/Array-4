// Time Complexity : O(N*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Bruteforce :
 1. Check all possible indexes.
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            int sum =0;
            for(int j=i; j<nums.length;j++){
                sum = sum+nums[j];
                result = Math.max(result, sum);
            }
        }
        return result;
    }
}


// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Kadane's algorithm
 */

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        int result = nums[0];
        int curr_sum = nums[0];
        for(int i = 1; i<nums.length; i++){
            curr_sum = Math.max(curr_sum + nums[i], nums[i]);
            result = Math.max(result, curr_sum);
        }
        return result;
    }
}




// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Kadane's algorithm -
 */
//Maximum subarray with start and end index
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length==0) return 0;
        int global_sum = nums[0];
        int curr_sum = nums[0];
        int start =0; int end =0;
        for(int i = 1; i<nums.length; i++){
            if(curr_sum + nums[i] < nums[i]){
                start = i;
                curr_sum = nums[i];
            }
            else{
                curr_sum = curr_sum + nums[i];
            }
            if(global_sum < curr_sum){
                end = i;
                global_sum = curr_sum;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return global_sum;
    }
}