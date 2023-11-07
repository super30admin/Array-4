// ## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// approach iterate thru the array, at each element make a decision, if it alone is greater than the enitre previous array, keep the element alone. If not, add it to some and move forward. keep track of the maximum sum encountered.

class Solution {
    public int maxSubArray(int[] nums) {

        if(nums == null || nums.length==0)
        {
            return 0;
        }

        int rsum= nums[0];
        int sum= nums[0];

        for(int i=1;i<nums.length;i++)
        {
            rsum = Math.max(rsum+nums[i], nums[i]);
            sum = Math.max(sum, rsum);
        }
        return sum;
        
    }
}


//In case we need to return the subarray too

class Solution {
    public int maxSubArray(int[] nums) {

        if(nums == null || nums.length==0)
        {
            return 0;
        }

        int rsum= nums[0];
        int sum= nums[0];

        int start =0;
        int end =0;
        int maxstart=0;
        int maxend=0;

        for(int i=1;i<nums.length;i++)
        {
            if(rsum+nums[i]>nums[i])
            {
                rsum+=nums[i];
                end+=1;
            }
            else
            {
                start=end=i;
                rsum=nums[i];
            }
            if(rsum>sum)
            {
                maxstart=start;
                maxend=end;
                sum=rsum;
            }
            
        }
        System.out.println(maxstart+" "+maxend);
        return sum;
        
    }
}