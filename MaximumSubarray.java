//Time: O(N) | Space: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        // kadne's algo
        // so we keep running sum throughout,
        // at any point, when the curr element in the array is lesser than current running sum,
        // we make choices choosing either resetting the current running sum with current element or the running sum itself
        // depending upon whichever serves the purpose
        for(int i=0;i<nums.length;i++) {
            curr = Math.max(curr+nums[i], nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}