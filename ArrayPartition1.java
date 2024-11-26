// Time: O(NLogN) | Space: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        // once the array is sorted,
        // every element in even postition would definitely be lesser or equal to every adjacent element to it which makes it pair
        for(int i=0;i<nums.length;i=i+2) {
            result += nums[i];
        }
        return result;
    }
}