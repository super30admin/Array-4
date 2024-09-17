// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            maxSum=Math.max(maxSum,sum);
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                maxSum=Math.max(maxSum,sum);
            }
            sum=0;
        }
        return maxSum;
    }
}

//////////////
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(curr+nums[i],nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}