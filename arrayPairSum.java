// Time Complexity: O(nlog(n))
// Space Complexity: O(1)
// Approach: Idea here is ot sort the elements so that bigger elements are prevented to be matched
// with smaller elements and there by taking small values from small pair and big values from big pairs
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = nums[0];
        for(int i=2; i< nums.length-1; i=i+2) {
            sum+=nums[i];
        }
        return sum;
    }
}