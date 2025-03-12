class Solution {
    //Time Complexity:O(n)
    //Space Complexity:O(1)
    public int maxSubArray(int[] nums) {
        
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i=0; i< nums.length;i++){
            localMax = Math.max (localMax + nums[i], nums[i]);
            globalMax = Math.max (localMax, globalMax);
        }
        return globalMax;
    }
}
