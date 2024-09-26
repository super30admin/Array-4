// Time Complexity : O(N log N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.Arrays;

public class ArrayPartition {
	 public int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum=0;
	        for(int i=0;i<nums.length;i=i+2){
	            //sum+=Math.min(nums[i],nums[i+1]);
	            sum+=nums[i];
	        }
	        
	        return sum;
	    }
}
