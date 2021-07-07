// =========== Approach-1 ============
/*
Time: O(N log N), space: O(1)
Approach:
1. Sort the array
2. Min of two would be odd index 
3. So, add all indices to get the total
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2) {
                sum += nums[i];
        }
        return sum;
    }
}