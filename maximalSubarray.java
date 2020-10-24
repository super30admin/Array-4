
public class maximalSubarray {
	
	// O(N) traversing through the entire array only once
	// O(1) constant space
	public int maxSubarray(int[] nums) {
		
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		
		for(int i=0;i<nums.length;i++) {
//		 check if the previous sum and curr element is greater than current number and take the maximum value
//		 if the current sum is greatet than maximum SUm, we update our maximum, we repeatedly find the currSum and update our maxSum
			currSum = Math.max(currSum+nums[i], nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
	public int maxSubArrayBruteForce(int[] nums) {		
		// TC: O(n^2)
		// SC: O(1) constant space
		int sum = 0, max = Integer.MIN_VALUE;
		// repeatedly check for the sum for each combination starting from first index and update our max value comparing it with sum
		
		for(int i=0;i<nums.length;i++) {
			sum = 0;
			for(int j=i;j<nums.length;j++) {
				sum += nums[j];
				
				if( max < sum)
					max = sum;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		maximalSubarray ms = new maximalSubarray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(ms.maxSubarray(nums));
	}
}
