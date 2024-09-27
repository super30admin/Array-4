package array4;

import java.util.Arrays;

public class ArrayPartitionI {
	//Time Complexity : O(n log n), where n is length of nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 2;
        int max = 0;
        while(i < j) {
            max += nums[i] + nums[j];
            i += 2;
            j -= 2;
        }
        if(i == j)
            max += nums[i];
        
        return max;
    }
	
	//Time Complexity : O(n log n), where n is length of nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int arrayPairSum1(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int max = 0;
        while(i < nums.length) {
            max += nums[i];
            i += 2;
        }
        
        return max;
    }
}
