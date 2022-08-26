//Time Complexity: O(n); where n is the length of nums array
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem2 {

    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return -1;
        
        int rsum = 0;
        int max = Integer.MIN_VALUE;
        
        int n = nums.length;
        
        for(int i =0; i <n; i++)
        {
            rsum = Math.max(rsum + nums[i],nums[i]);
            max = Math.max(rsum, max);
        }
        
        return max;
    }
}
