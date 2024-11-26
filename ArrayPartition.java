//Time Complexity O(NLog N)
//Space Complexity O(1)
//Leetcode tested

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i= i+2) {
            result+=nums[i];
        }
        return result;
    }
}
