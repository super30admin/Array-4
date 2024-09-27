package array4;

public class MaximumSubArray {
	//Follow-up: Get the indices of max
	//Time Complexity : O(n), where n is length of nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];
        int currStart = 0, start = 0, end = 0;
        
        for(int i=1; i<nums.length; i++) {
            if(currSum + nums[i] < nums[i]) {
                currStart = i;
                currSum = nums[i];
            } else
                currSum += nums[i];
            
            if(max < currSum) {
                start = currStart;
                end = i;
                max = currSum;
            }
        }
        
        System.out.println(start);
        System.out.print(end);
        return max;
    }
	
	//Time Complexity : O(n), where n is length of nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int maxSubArray1(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            max = Math.max(currSum, max);
        }
        return max;
    }
	
	//Time Complexity : O(n^2), where n is length of nums
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : TLE
	//Any problem you faced while coding this : No
	public int maxSubArray2(int[] nums) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                currSum += nums[j];
                max = Math.max(max, currSum);
            }
            currSum = 0;
        }
        return max;
    }
}
