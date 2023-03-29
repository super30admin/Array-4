//Time Complexity : O(NlogN) 
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**
 * Sort the array in ascending order and pick the even elements to add. return
 * the total even sum.
 *
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        for(int i=0; i< n; i+=2){
            result +=  nums[i];
        }
        
        return result;
    }
}
