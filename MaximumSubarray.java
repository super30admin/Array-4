// TC - O(n), SC - O(1)

// LC - 53

class Solution {
    public int maxSubArray(int[] nums) {
		// sanity check
        if(nums == null || nums.length == 0){
            return 0;
        }           
        int currSum = 0;
        int maxSum = nums[0];
		// iterate over nums array
        for(int num : nums){
			// calculate curSum which is just the cur number or max of curnum and curnum and cursum
            currSum = Math.max(num, currSum + num);
			// maxsum is max of maxsum and currsum
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxSum = nums[0];
//         for(int i=1; i<n ;i++){
//             if(nums[i-1] > 0){
//                 nums[i] += nums[i-1]; 
//             }
//             maxSum = Math.max(nums[i], maxSum);
//         }
//         return maxSum;
//     }
// }