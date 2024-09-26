//TC: O(nlogn)
//SC: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        int maxSum = 0;
        
        // Step 2: Sum the elements at even indices
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}
