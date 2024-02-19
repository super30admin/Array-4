// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Method used : Sorting and Greedy

class Solution {
    public int arrayPairSum(int[] nums) {
        
        // Greedy approach. Let's be greedy about picking up minimum among the pairs.

        // Sort the array
        Arrays.sort(nums);

        int result = 0;

        for(int i = 0; i < nums.length; i += 2)
        {
            // Assume a pair at index 0 and 1 the min element will always be at 0th index
            // Next pair would be at index 2 and 3, so min will be at index 2 in that pair as array is sorted
            result += nums[i];
        }

        return result;
    }
}