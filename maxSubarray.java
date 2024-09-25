//Time Complexity: O(n)
//Space Complexity: O(1)
//Did it run on leetcode : yes

class Solution {
    public int maxSubArray(int[] nums) {
        int max_total = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            max_total += nums[i];
            max_total = Math.max(max_total, nums[i]);
            if(max_total>max)
                max = max_total;
        }
        
        return max;
    }
}
