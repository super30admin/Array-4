// O(N), O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int tempMax = 0; int ans = Integer.MIN_VALUE;
        for(int num : nums) {
            tempMax = Math.max(num+tempMax, num);
            ans = Math.max(ans, tempMax);
        }
        
        return ans;
    }
}
