//Time - O(n)
//Space - O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        
         int n=nums.length;
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] ans = new int[nums.length];
        ans[0]=nums[0];
         
        int max = Integer.MIN_VALUE;
        max = Math.max(max,ans[0]);
        for(int i=1;i<n;i++)
        {
            if(nums[i]>(nums[i]+ans[i-1])) ans[i]=nums[i];
            else
                ans[i] = (nums[i]+ans[i-1]);
            max = Math.max(max,ans[i]);
        }
        return max;
        }
    }


//Time-O(n)
//Space-O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int local = nums[0];
        int global = local;
        for(int i=1;i<nums.length;i++){
            local = Math.max(nums[i],local+nums[i]);
            global = Math.max(local,global);
        }
        return global;
    }
}
