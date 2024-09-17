/**
 * Time Complexity : O(n) where n is the number of elements in the array
 * Space Complexity : O(1)
 */
public class ContiguousMaxSubArray{
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){return 0;}
           int max = Integer.MIN_VALUE;                                                            
           int sum =0 ;
       for(int i =0; i < nums.length; i++){
           sum = Math.max(nums[i], sum + nums[i]);                                                 
           max = Math.max(sum, max);                                                               
       }
           return max;
       }
}