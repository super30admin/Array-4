// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
// To find the maximum sum of the subarray, we will use Sum and Max variables. Sum will keep getting updated with the maximum of the sum calculated so far+incoming element and the incoming element. Max will get updated with the maximum sum found till now.

class Solution {
    public int maxSubArray(int[] nums) {
        //set both max and sum to the first number
        int max=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}


//  To return the starting and ending indices of the subarray, we will maintain , three pointers, St, currSt and end. We will set all the pointeron the first index. We keep moving the end index until we find a number which is greater than the calculated sum so far. Here we will set the currSt to the index of the new number. Then we will keep moving the end index. If the value of the calculated sum exceeds the previous max, then we will set the max to the new sum and move the st pointer to the currSt.
//TC: O(n) SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        //set both max and sum to the first number
        int max=nums[0];
        int sum=nums[0];
        int st=0,currSt=0,end=0;

        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum<nums[i]) //if the calculated sum is less than the incoming number
            {
                currSt=i;
                sum=nums[i];
            }
            if(max<sum)
            {
                max=sum;
                st=currSt;
                end=i;
            }
        }
        System.out.println("Start = " + st);
        System.out.println("End = " + end);
        return max;
    }
}