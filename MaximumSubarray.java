//TC = O(N)
//SC = O(1)

/*
 * Kadane's algorithm is used over here. 
 */

import java.util.*;

public class MaximumSubarray {
    
    public static int maxSubArray(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        int maxSum = nums[0];
        int sumTillNow = 0;

        for(int i=0;i<nums.length;i++)
        {
            sumTillNow+=nums[i];

            if(sumTillNow>maxSum)
            {
                maxSum = sumTillNow;
            }

            if(sumTillNow<0)
            {
                sumTillNow=0;
            }
        }

        return maxSum;
    }

    public static void main(String args[])
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
