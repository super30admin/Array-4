// Time Complexity : O(n * log n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * we have 2n elements in array where n are small and n are large.
 * We can get max sum only if half from large n elements can get selected
 * For this, we sort array and form pairs with immediate next elements.
 * Because of this, only 1/2 from 1st n elements get selected and it allows us to choose 1/2 elements from last n elements
 * Also, we make sure, no large elements get wasted by pairing it with too small digit else 2 small digits will get selected instead of 1 small and 1 big
*/


class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        
        for(int i = 0; i < nums.length;i=i+2){
            sum = sum + nums[i];
        }
        
        return sum;
    }
}