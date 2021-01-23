/*Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, *bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
* TC O(nlogn) SC O(1)
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i<nums.length; i = i +2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
