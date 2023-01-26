//Time Complexity: O(nlogn)
//Space Complexity: O(1)

/*
 * we sort the array and pair each element with the number just bigger
 * so we can get the max value when adding the lowest value.
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        for(int i = 0; i < n; i+=2){
            result += nums[i];
        }
        return result;
    }
}