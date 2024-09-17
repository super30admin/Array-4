//Time Complexity-O(n)
//Space Complexity-O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0||
          nums==null)
        {
            return 0;
        }
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int x:nums)
        {
            cur_sum=Math.max(cur_sum+x,x);
            max_sum=Math.max(cur_sum,max_sum);
        }
        return max_sum;
    }
}