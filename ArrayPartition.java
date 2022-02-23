// Time Complexity : O(n) -  O(nlogn) + O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/* Approach** : Greedy - Coz at every position we are choosing the best

        1. Sort given array - By sorting we reduce intra-pair distance
        2. Take sum of alternate indices as they will be minimum among consecutive pairs
*/

import java.util.Arrays;

public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sum = 0;

        Arrays.sort(nums);
        //sum alternative elements as they will be minimum
        //among the consecutive pairs
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }

        return sum;
    }
}
