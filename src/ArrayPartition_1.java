// Time Complexity : O(nlogn)
// Space Complexity : O(log n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

import java.util.Arrays;

public class ArrayPartition_1 {
	public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}
