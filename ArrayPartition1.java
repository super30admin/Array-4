package Array4;
// Time Complexity :O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

import java.util.Arrays;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for(int i=0; i<nums.length; i+=2){
            total += Math.min(nums[i], nums[i+1]);
        }
        return total;
    }
}
