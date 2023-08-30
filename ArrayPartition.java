// Time Complexity : O(N*LOG(N))  for sorting the array 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/*
 * First sorted the array in the increasing order and pair the smaller numbers going forward, so the larger value is not wasted while pairing so the sum of min will be maximum.
 */

import java.util.Arrays;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int sum = 0;
        while(i<nums.length){
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}