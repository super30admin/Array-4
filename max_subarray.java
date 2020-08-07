//TC - O(N)
//SC - O(1)
class Solution2 {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int start = 0;
		int end = 0;
		int max = Integer.MIN_VALUE;
		int rSum = 0;
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			rSum = rSum + nums[i];
			if (nums[i] > rSum) {
				k = i;
				rSum = nums[i];
			}
			if (rSum > max) {
				start = k;
				end = i;
				max = rSum;
			}
		}
		return max;
	}
}