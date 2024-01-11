//  Time Complexity: O(n)
//  Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0, maxsum = Integer.MIN_VALUE;

        for(int i=0; i< nums.length; i++){
            currsum = Math.max(currsum + nums[i], nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
        
    }
}